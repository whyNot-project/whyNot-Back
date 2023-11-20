package com.whyNot.model.dto;

public class UserCrew {
	
	private String userId;
	private int crewId;
	
	public UserCrew() {
	}

	public UserCrew(String userId, int crewId) {
		super();
		this.userId = userId;
		this.crewId = crewId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCrewId() {
		return crewId;
	}

	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}

	@Override
	public String toString() {
		return "UserCrew [userId=" + userId + ", crewId=" + crewId + "]";
	}
	
}
