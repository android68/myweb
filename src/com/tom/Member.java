package com.tom;

public class Member {
	String userid;
	String password;
	String password2;
	String email;
	public Member(){
		
	}
	public Member(String userid, String password, String password2, String email) {
		super();
		this.userid = userid;
		this.password = password;
		this.password2 = password2;
		this.email = email;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
