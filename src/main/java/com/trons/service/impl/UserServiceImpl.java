package com.trons.service.impl;

import com.trons.dao.UserDao;
import com.trons.entity.User;
import com.trons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by trons on 16-6-23.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public boolean checkUserExist(String userName) {
        return userDao.getUserByName(userName) != null;
    }

    public User Login(String userName, String password) {
        User user = userDao.getUserByName(userName);
        return null;
    }

    public User getUserInfo(String userName) {
        return userDao.getUserByName(userName);
    }
}
