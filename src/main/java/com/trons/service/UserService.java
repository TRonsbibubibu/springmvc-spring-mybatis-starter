package com.trons.service;

import com.trons.entity.User;

/**
 * Created by trons on 16-6-23.
 */
public interface UserService {
    boolean checkUserExist(String userName);

    User Login(String userName, String password);

    User getUserInfo(String userName);
}
