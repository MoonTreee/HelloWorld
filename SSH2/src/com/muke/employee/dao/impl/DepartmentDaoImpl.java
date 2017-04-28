package com.muke.employee.dao.impl;

import com.muke.employee.dao.DepartmentDao;
import com.muke.employee.domain.Department;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Tree on 2017/3/14.
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

    @Override
    //计算一共有多少条记录
    public int findCount() {
        String hql = "select count(*) from Department";
        List<Long> list = this.getHibernateTemplate().find(hql);
        if(list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    //分页查询部门
    public List<Department> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Department.class);
        List<Department> list=this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
        return list;
    }

    @Override
    //DAO添加部门
    public void save(Department department) {
        this.getHibernateTemplate().save(department);
    }

    @Override
    //DAO根据部门ID查询方法
    public Department findById(Integer did) {
        return this.getHibernateTemplate().get(Department.class, did);
    }

    @Override
    //DAO更新部门信息的方法
    public void update(Department department) {
        this.getHibernateTemplate().update(department);
    }
}
