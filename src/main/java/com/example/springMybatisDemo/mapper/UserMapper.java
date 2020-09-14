package com.example.springMybatisDemo.mapper;

import com.example.springMybatisDemo.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User add(int id);

    User selectUser(String username);

    User deleteUser(String username);

}
