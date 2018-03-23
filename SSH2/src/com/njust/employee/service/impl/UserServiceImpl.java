package com.njust.employee.service.impl;

import com.njust.employee.dao.UserDao;
import com.njust.employee.domain.User;
import com.njust.employee.service.UserService;

public class UserServiceImpl implements UserService {
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;
    @Override
    public User login(User user) {
        User existUser = userDao.findByUsernameAndPassword(user);
        return existUser;
    }
}
