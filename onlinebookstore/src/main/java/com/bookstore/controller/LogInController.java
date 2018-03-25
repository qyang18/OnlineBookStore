package com.bookstore.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookstore.model.UserInfo;
import com.bookstore.service.UserInfoService;

@Controller
public class LogInController {
	@GetMapping( value="/login")
	public String login()
	{
		return "login";
	}
	@PostMapping( value="/login")
	public String login(@ModelAttribute UserInfo user,HttpServletRequest request, ModelMap map)
	{
		System.out.println(user.getUserID());
		System.out.println(user.getPassword());
		//find in database
		UserInfo userInDB=UserInfoService.findInDatabase(user);
//		JSONObject jsonObject = new JSONObject();
		if (userInDB==null)
		{
			//System.out.println("user don't exist")
			return null;
		}else if (UserInfoService.comparePwd(user.getPassword(),userInDB.getPassword())==false)
		{
			//System.out.println("wrong password")
			return null;
		}else
		{
//			jsonObject.put();
		}
//		return jsonObject;
		
		map.put("UserID", user.getUserID());
		map.put("Password", user.getPassword());
		
		request.setAttribute("HelloMessage", "This is a hello message from HttpServletRequest.Attribute");
		return "home";
	}
}
