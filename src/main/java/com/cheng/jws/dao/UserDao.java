package com.cheng.jws.dao;

import com.cheng.jws.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author chenghui
 */
@Repository("userDao")
public interface UserDao {
    User findByName(String name);

    User getUser(int id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    int getUserNum(User user);

    User test();
}
