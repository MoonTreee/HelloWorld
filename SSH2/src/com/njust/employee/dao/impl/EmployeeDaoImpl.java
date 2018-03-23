package com.njust.employee.dao.impl;

import com.njust.employee.dao.EmployeeDao;
import com.njust.employee.domain.Employee;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Tree on 2017/3/13.
 * Dao层的实现类
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {


    @Override
    public List<Employee> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
        List<Employee> list=this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
        return list;
    }

    @Override
    public void save(Employee employee) {
        this.getHibernateTemplate().save(employee);

    }

    @Override
    public Employee findById(Integer eid) {
        return this.getHibernateTemplate().get(Employee.class, eid);
    }

    @Override
    public void update(Employee employee) {
        this.getHibernateTemplate().update(employee);

    }

    @Override
    public void delete(Employee employee) {
        this.getHibernateTemplate().delete(employee);
    }

    @Override
    public int findCount() {
        String hql = "select count(*) from Employee";
        List<Long> list = this.getHibernateTemplate().find(hql);
        if(list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }
}
