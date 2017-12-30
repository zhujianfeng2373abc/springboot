package com.xiaozhu.service;

import com.xiaozhu.dao.UserMapper;
import com.xiaozhu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 14:18 2017/12/17
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUser(String loginName) {
        return userMapper.getUser(loginName);
    }
}
