package com.njust.employee.dao.impl;

import com.njust.employee.dao.UserDao;
import com.njust.employee.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public User findByUsernameAndPassword(User user) {
        String hql = "from User  where username = ? and password = ?";
        //System.out.println(employee.getUsername());
        List<User> list =this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword());
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
