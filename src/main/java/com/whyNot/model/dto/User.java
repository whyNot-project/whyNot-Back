package com.whyNot.model.dto;

public class User {
	
	private String userId;
	private String password;
	private String nickname;
	private int phoneNumber;
	private boolean gender;
	private String location;
	private String profileImgName;
	private String profileImgPath;
	private int type;
	
	public User() {
	}

	public User(String userId, String password, String nickname, int phoneNumber, boolean gender, String location,
			String profileImgName, String profileImgPath, int type) {
		super();
		this.userId = userId;
		this.password = password;
		this.nickname = nickname;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.location = location;
		this.profileImgName = profileImgName;
		this.profileImgPath = profileImgPath;
		this.type = type;
	}

	public User(String userId, String password, String nickname, int phoneNumber, boolean gender, String location,
			int type) {
		super();
		this.userId = userId;
		this.password = password;
		this.nickname = nickname;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.location = location;
		this.type = type;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProfileImgName() {
		return profileImgName;
	}

	public void setProfileImgName(String profileImgName) {
		this.profileImgName = profileImgName;
	}

	public String getProfileImgPath() {
		return profileImgPath;
	}

	public void setProfileImgPath(String profileImgPath) {
		this.profileImgPath = profileImgPath;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", nickname=" + nickname + ", phoneNumber="
				+ phoneNumber + ", gender=" + gender + ", location=" + location + ", profileImgName=" + profileImgName
				+ ", profileImgPath=" + profileImgPath + ", type=" + type + "]";
	}
	

}
