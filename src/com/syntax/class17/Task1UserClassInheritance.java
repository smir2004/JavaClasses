package com.syntax.class17;


public class Task1UserClassInheritance {
	  String name;
	 int num;
	 String address;
	void userDetails() {
		System.out.println("Customer name is "+ name+ " mobile number is "+num+" and address is "+address);
	
	}
	static class UserInfo extends Task1UserClassInheritance{
		public UserInfo(String name, int num, String address) {
			// TODO Auto-generated constructor stub
		
			this.name= name;
			this.num= num;
			this.address= address;
		}
	}
	public static void main(String[] args) {
		UserInfo userinfo = new UserInfo("Mike", 516545, "23 Doburn Rd");
		userinfo.userDetails();
	}

}
