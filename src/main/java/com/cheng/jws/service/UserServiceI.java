package com.cheng.jws.service;

import com.cheng.jws.domain.User;

public interface UserServiceI {
    User getUser(int id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    int getUserNum(User user);

    User test();
}
