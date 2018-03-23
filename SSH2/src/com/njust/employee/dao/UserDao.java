package com.njust.employee.dao;

import com.njust.employee.domain.User;

public interface UserDao {
    User findByUsernameAndPassword(User user);
}
