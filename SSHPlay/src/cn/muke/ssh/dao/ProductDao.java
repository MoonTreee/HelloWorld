package cn.muke.ssh.dao;

import cn.muke.ssh.domain.Product;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by Tree on 2017/2/23.
 */
public class ProductDao extends HibernateDaoSupport {
    public void save(Product product) {
        System.out.println("DAO中的save方法执行了....");
        this.getHibernateTemplate().save(product);
    }
}
