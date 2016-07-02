package com.trons.dao;

import com.trons.entity.User;

import java.util.List;

/**
 * Created by trons on 16-6-23.
 */
public interface UserDao {
    User getUserById(long userId);

    User getUserByName(String name);
}
