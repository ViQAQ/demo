package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dao.UserDao;
import com.test.dto.User;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/query")
	public String queryUser(){
    	  List<User> users = userDao.queryUserListById(1l);
          return "login";
	}
}
