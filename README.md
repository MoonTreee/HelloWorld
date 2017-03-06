hello world！这是一个基于SSH框架整合的系统，主要是实践学习各个框架的配置以及整合！


1.applicationContext配置：
<!-- 引入外部的属性文件 -->
    <context:property-placeholder location="classpath:jdbc.properties"/>
    <!-- 配置连接池 -->
    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <property name="driverClass" value="${jdbc.driverClass}"></property>
        <property name="jdbcUrl" value="${jdbc.url}"></property>
        <property name="user" value="${jdbc.username}"></property>
        <property name="password" value="${jdbc.password}"></property>
    </bean>
    <!-- 配置hibernate的相关属性 -->
    <bean id="sessionFactory" class="org.springframework.orm.hibernate3.LocalSessionFactoryBean">
        <!-- 注入连接池 -->
        <property name="dataSource" ref="dataSource"></property>
        <!-- 加载hibernate相关属性 -->
        <property name="hibernateProperties">
            <props>
                <prop key="hibernate.dialect">org.hibernate.dialect.MySQLDialect</prop>
                <prop key="hibernate.show_sql">true</prop>
                <prop key="hibernate.format_sql">true</prop>
                <prop key="hibernate.hbm2ddl.auto">update</prop>
            </props>
        </property>
        <!-- 加载hibernate中的映射文件 -->
        <property name="mappingResources">
            <list>
                <value>cn/muke/ssh/domain/Product.hbm.xml</value>
            </list>
        </property>
    </bean>
    <bean id="productAction" class="cn.muke.ssh.action.ProductAction" scope="prototype">
        <property name="productService" ref="productService"></property>
    </bean>
    <bean id="productService" class="cn.muke.ssh.service.ProductService">
        <property name="productDao" ref="productDao"></property>
    </bean>
    <!--配置DAO-->
    <bean id="productDao" class="cn.muke.ssh.dao.ProductDao">
        <property name="sessionFactory" ref="sessionFactory"></property>
    </bean>
    <!-- 配置事务管理 -->
    <bean id="transaction" class="org.springframework.orm.hibernate3.HibernateTransactionManager">
        <property name="sessionFactory" ref="sessionFactory"></property>
    </bean>
    <!-- 开启注解事务 -->
    <tx:annotation-driven transaction-manager="transaction"></tx:annotation-driven>
</beans>

2.Status2配置：拦截页面的action
<struts>
    <package name="ssh" extends="struts-default" namespace="/">
        <action name="product_*" class="cn.muke.ssh.action.ProductAction" method="{1}"></action>
    </package>
</struts>

3.Hibernate映射
<hibernate-mapping>
	<class name="cn.muke.ssh.domain.Product" table="product">
		<id name="pid" column="pid">
			<generator class="native"></generator>
		</id>
		<property name="pname" column="pname" length="20"></property>
		<property name="price" column="price"></property>
	</class>
</hibernate-mapping>