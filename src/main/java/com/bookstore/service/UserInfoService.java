package com.bookstore.service;

import com.bookstore.model.UserInfo;

public class UserInfoService {
	public static UserInfo findInDatabase(UserInfo user)
	{
		//find in databse
		return user;
	}

	public static boolean comparePwd(String password, String password2) {
		return password.equals(password2);
	}
	
}
