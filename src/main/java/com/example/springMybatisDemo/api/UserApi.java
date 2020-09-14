package com.example.springMybatisDemo.api;

import com.example.springMybatisDemo.mapper.UserMapper;
import com.example.springMybatisDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @Autowired
    UserMapper userMapper;

    @PostMapping("user")
    User login(@RequestParam String username){
        return userMapper.selectUser(username);
    }

}
