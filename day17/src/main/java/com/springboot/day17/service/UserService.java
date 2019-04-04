package com.springboot.day17.service;

import com.springboot.day17.entity.UserEntity;
import com.springboot.day17.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 用户业务层
 * @author: huangh
 */
public class UserService implements UserDetailsService {

    @Autowired
    private UserJPA userJPA;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userJPA.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("未查询到用户：" + username + "信息");
        }
        return user;
    }

}
