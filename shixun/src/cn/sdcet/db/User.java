package cn.sdcet.db;

public class User {
	
	 String username;
	 String password;
	public User(){
		super();
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	

}