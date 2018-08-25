package com.cuteximi.service;

import com.cuteximi.domain.User;


import java.util.List;


public interface IUserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAllUsers();

}
