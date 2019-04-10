package com.lanc.service.impl;

import com.lanc.domain.User;
import com.lanc.repository.UserRepository;
import com.lanc.service.IUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zzl
 * @Date: 2019/3/12 17:54
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements IUserSevice {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User result = userRepository.save(user);
        return result;
    }
}
