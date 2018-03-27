package com.brokendawn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brokendawn.model.UserInfo;

@RestController
public class HomeController {
	
	@Autowired
	UserInfo UserBean;
	
	@RequestMapping("/index")
	public String Index()
	{
		return "index";
	}
	@RequestMapping("/hello")
	public String Hello()
	{
		return "Hello";
	}
	@RequestMapping("/User")
	public UserInfo getUserInfo()
	{
		UserBean.setAddress("3001 S Michigan");
		return UserBean;
	}
	
}
