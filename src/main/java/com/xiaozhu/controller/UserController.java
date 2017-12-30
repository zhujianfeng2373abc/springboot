package com.xiaozhu.controller;

import com.xiaozhu.pojo.User;
import com.xiaozhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 14:13 2017/12/17
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(String loginName) {
        return userService.getUser(loginName);
    }
}
