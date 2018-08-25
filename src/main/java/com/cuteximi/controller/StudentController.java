package com.cuteximi.controller;

import com.cuteximi.domain.User;
import com.cuteximi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @program: springmvcdemo
 * @description: 测试
 * @author: TSL
 * @create: 2018-08-25 18:17
 **/

@Controller
public class StudentController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String test1(Model model) {

        List<User> users = userService.findAllUsers();
        model.addAttribute("userList", users);
        return "user";

    }

}
