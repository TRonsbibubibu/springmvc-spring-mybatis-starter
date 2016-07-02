package com.trons.controller;

import com.trons.entity.User;
import com.trons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by trons on 16-6-23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    @ResponseBody
    public User indexs(){
        User user = new User();
        user.setEmail("23423423423432");
        return user;
    }

    @RequestMapping(path = "/account/{username}",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("username") String username){
        return userService.getUserInfo(username);
    }
}
