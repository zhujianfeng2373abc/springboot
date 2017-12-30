package com.xiaozhu.pojo;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.jboss.logging.Field;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 14:14 2017/12/17
 */
public class User {
    private String name;

    private String loginName;
    private String email;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
