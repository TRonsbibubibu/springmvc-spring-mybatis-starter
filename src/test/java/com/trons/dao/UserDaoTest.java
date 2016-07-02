package com.trons.dao;

import com.trons.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by trons on 16-6-23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
        System.out.println("testBegin");
    }

    @Test
    public void testGetUserById() throws Exception {
        long userId = 10;
        User user = userDao.getUserById(userId);
        System.out.println(user);
    }

    @Test
    public void getUserByName() throws Exception {
        String name = "Beginning";
        User user = userDao.getUserByName(name);
        System.out.println(user);
    }

}