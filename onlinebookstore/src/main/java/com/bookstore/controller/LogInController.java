package com.bookstore.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.model.UserInfo;

@RestController
public class LogInController {
	@RequestMapping( value="/login",method=RequestMethod.POST)

	public String login(@RequestBody UserInfo user)
	{
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		//find in database
		UserInfo userInDB=UserInfoService.findInDatabase(user.getName());
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
		return "log in successful";
	}
}
