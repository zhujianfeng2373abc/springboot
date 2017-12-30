package com.xiaozhu.dao;

import com.xiaozhu.pojo.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 14:13 2017/12/17
 */
public interface UserMapper {
    @Results(id = "getUser", value = {
            @Result(property = "loginName", column = "login_name")
    })
    @Select("SELECT * FROM SYS_USER WHERE `login_name` = #{loginName}")
    public User getUser(String loginName);
}
