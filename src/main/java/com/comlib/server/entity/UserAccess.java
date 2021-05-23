package com.comlib.server.entity;

//User access represents the communities to which a user has access to. This is a general access to add or lend books.

public class UserAccess {

	private int id;
	private int userId;
	private int communityId;
	private boolean isActive;
	private String accessStartDate;
	private String accessEndDate;
	private int accessProviderUserId;

	public UserAccess() {
		super();
	}

	public UserAccess(int userId, int communityId, boolean isActive, String accessStartDate, String accessEndDate,
			int accessProviderUserId) {
		super();
		this.userId = userId;
		this.communityId = communityId;
		this.isActive = isActive;
		this.accessStartDate = accessStartDate;
		this.accessEndDate = accessEndDate;
		this.accessProviderUserId = accessProviderUserId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCommunityId() {
		return communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setValid(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAccessStartDate() {
		return accessStartDate;
	}

	public void setAccessStartDate(String accessStartDate) {
		this.accessStartDate = accessStartDate;
	}

	public String getAccessEndDate() {
		return accessEndDate;
	}

	public void setAccessEndDate(String accessEndDate) {
		this.accessEndDate = accessEndDate;
	}

	public int getAccessProviderUserId() {
		return accessProviderUserId;
	}

	public void setAccessProviderUserId(int accessProviderUserId) {
		this.accessProviderUserId = accessProviderUserId;
	}

	@Override
	public String toString() {
		return "UserAccess [userAccessId=" + id + ", userId=" + userId + ", communityId=" + communityId + ", isActive="
				+ isActive + ", accessStartDate=" + accessStartDate + ", accessEndDate=" + accessEndDate
				+ ", accessProviderUserId=" + accessProviderUserId + "]";
	}
}
