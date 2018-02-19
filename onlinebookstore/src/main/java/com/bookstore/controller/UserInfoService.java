package com.bookstore.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bookstore.model.UserInfo;

public class UserInfoService {
	public static UserInfo findInDatabase(String name)
	{
		//find in databse
		return null;
	}

	public static boolean comparePwd(String password, String password2) {
		return password.equals(password2);
	}
	
}
