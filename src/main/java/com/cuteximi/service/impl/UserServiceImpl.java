package com.cuteximi.service.impl;

import com.cuteximi.domain.User;
import com.cuteximi.mapper.UserMapper;
import com.cuteximi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springmvcdemo
 * @description: user查询实现类
 * @author: TSL
 * @create: 2018-08-25 18:36
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        List<User> list = userMapper.findAllUsers();
        return list;
    }

}
