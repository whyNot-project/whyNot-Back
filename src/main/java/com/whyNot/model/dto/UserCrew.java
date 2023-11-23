package com.whyNot.model.dto;

public class UserCrew {
	
	private String userId;
	private int crewId;
	private String crewName;
	private String content;
	private String schedule;
	private int tag;
	private String location;
	private String regDate;
	private int memberNum;
	private String leader;
	private int isInside;
	private int isSingle;
	private int isCardio;
	private int useEquip;
	
	public UserCrew() {
	}

	public UserCrew(String userId, int crewId, String crewName, String content, String schedule, int tag,
			String location, String regDate, int memberNum, String leader, int isInside, int isSingle, int isCardio,
			int useEquip) {
		super();
		this.userId = userId;
		this.crewId = crewId;
		this.crewName = crewName;
		this.content = content;
		this.schedule = schedule;
		this.tag = tag;
		this.location = location;
		this.regDate = regDate;
		this.memberNum = memberNum;
		this.leader = leader;
		this.isInside = isInside;
		this.isSingle = isSingle;
		this.isCardio = isCardio;
		this.useEquip = useEquip;
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

	public String getCrewName() {
		return crewName;
	}

	public void setCrewName(String crewName) {
		this.crewName = crewName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public int getIsInside() {
		return isInside;
	}

	public void setIsInside(int isInside) {
		this.isInside = isInside;
	}

	public int getIsSingle() {
		return isSingle;
	}

	public void setIsSingle(int isSingle) {
		this.isSingle = isSingle;
	}

	public int getIsCardio() {
		return isCardio;
	}

	public void setIsCardio(int isCardio) {
		this.isCardio = isCardio;
	}

	public int getUseEquip() {
		return useEquip;
	}

	public void setUseEquip(int useEquip) {
		this.useEquip = useEquip;
	}

	@Override
	public String toString() {
		return "UserCrew [userId=" + userId + ", crewId=" + crewId + ", crewName=" + crewName + ", content=" + content
				+ ", schedule=" + schedule + ", tag=" + tag + ", location=" + location + ", regDate=" + regDate
				+ ", memberNum=" + memberNum + ", leader=" + leader + ", isInside=" + isInside + ", isSingle="
				+ isSingle + ", isCardio=" + isCardio + ", useEquip=" + useEquip + "]";
	}




}
