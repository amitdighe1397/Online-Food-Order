package com.example.payloads;

public class UserPayloads {

	private int UserId;
	private String Username;
	private String Email;
	private String Phone_Number;
	private String Address;
	private String Password;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "UserPayloads [UserId=" + UserId + ", Username=" + Username + ", Email=" + Email + ", Phone_Number="
				+ Phone_Number + ", Address=" + Address + ", Password=" + Password + "]";
	}

}
