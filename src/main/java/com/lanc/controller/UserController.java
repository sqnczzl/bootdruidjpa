package com.lanc.controller;

import com.lanc.domain.User;
import com.lanc.service.IUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zzl
 * @Date: 2019/3/12 17:56
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserSevice userSevice;

    @RequestMapping(value = "/createUser", method = RequestMethod.GET)
    public void createUser() {
        User user = new User();
        user.setId("163131333000");
        user.setName("zhang3");
        user.setAddress("北京");
        userSevice.createUser(user);
    }
}
