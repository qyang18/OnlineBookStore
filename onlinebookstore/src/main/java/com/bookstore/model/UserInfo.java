package com.bookstore.model;

public class UserInfo {
		String UserID;
		String Password;
		String PersonName;
		
		public UserInfo()
		{
			
		}
		public UserInfo(String id, String name,String password)
		{
			this.UserID=id;
			
			this.Password=password;
		}
		
		
		public String getPassword() {
			return Password;
		}
		
		public void setPassword(String password) {
			this.Password = password;
		}
		
		public String getUserID() {
			return UserID;
		}
		
		public void setUserID(String id) {
			this.UserID = id;
		}
		
		public String getPersonName() {
			return PersonName;
		}
		public void setPersonName(String personName) {
			PersonName = personName;
		}
}
