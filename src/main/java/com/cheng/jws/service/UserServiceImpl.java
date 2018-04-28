package com.cheng.jws.service;

import com.cheng.jws.dao.UserDao;
import com.cheng.jws.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenghui
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private UserDao userDao;

    public User getUser(int id) {
        return userDao.getUser(id);
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    public int getUserNum(User user) {
        return userDao.getUserNum(user);
    }

    @Override
    public User test() {
        return userDao.test();
    }

}