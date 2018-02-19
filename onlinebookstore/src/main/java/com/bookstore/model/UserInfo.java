package com.bookstore.model;

public class UserInfo {
//		int id;
		String id;
		String name;
		String password;
		public UserInfo(String id, String name,String password)
		{
			this.id=id;
			this.name=name;
			this.password=password;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getPassword() {
			return password;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		
}
