package com.bookstore.beans;

public class UserBean {
		//it's actually used as entity class, not as beans. 
		//	Because each registered user has a UserBean.
		private String UserID;
		private String Password;
		public UserBean()
		{
			UserID="";
			Password="";
		}
//		public UserBean(String UserID,String Password)
//		{
//			this.UserID=UserID;
//			this.Password=Password;
//		}
		public String getUserID() {
			return UserID;
		}
		public void setUserID(String userID) {
			UserID = userID;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		
}
