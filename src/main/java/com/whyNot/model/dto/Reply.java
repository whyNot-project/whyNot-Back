package com.whyNot.model.dto;

public class Reply {
	
	private int crewId;
	private int replyId;
	private String replyWriter;
	private String replyContent;
	
	public Reply() {
	}

	public Reply(int crewId, int replyId, String replyWriter, String replyContent) {
		super();
		this.crewId = crewId;
		this.replyId = replyId;
		this.replyWriter = replyWriter;
		this.replyContent = replyContent;
	}

	public int getCrewId() {
		return crewId;
	}

	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}

	public int getReplyId() {
		return replyId;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public String getReplyWriter() {
		return replyWriter;
	}

	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	@Override
	public String toString() {
		return "Reply [crewId=" + crewId + ", replyId=" + replyId + ", replyWriter=" + replyWriter + ", replyContent="
				+ replyContent + "]";
	}

	
}
