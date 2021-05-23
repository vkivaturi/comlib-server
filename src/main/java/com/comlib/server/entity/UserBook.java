package com.comlib.server.entity;

//User book represents the books that a user has added to the library and willing to lend to others.
//This book listing by user is community specific.

public class UserBook {

	private int id;
	private int userId;
	private int communityId;
	private int bookId;
	private boolean isActive;
	private boolean isAvailable;
	private int lendeeUserId;
	private String lendStartDate;

	public UserBook() {
		super();
	}

	public UserBook(int userId, int communityId, int bookId, boolean isActive, boolean isAvailable, int lendeeUserId, String lendStartDate) {
		super();
		this.userId = userId;
		this.communityId = communityId;
		this.bookId = bookId;
		this.isActive = isActive;
		this.isAvailable = isAvailable;
		this.lendeeUserId = lendeeUserId;
		this.lendStartDate = lendStartDate;
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

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getLendeeUserId() {
		return lendeeUserId;
	}

	public void setLendeeUserId(int lendeeUserId) {
		this.lendeeUserId = lendeeUserId;
	}

	public String getLendStartDate() {
		return lendStartDate;
	}

	public void setLendStartDate(String lendStartDate) {
		this.lendStartDate = lendStartDate;
	}

	@Override
	public String toString() {
		return "UserBook [userBookId=" + id + ", userId=" + userId + ", communityId=" + communityId + ", bookId="
				+ bookId + ", isAvailable=" + isAvailable + ", isActive=" + isActive + ", lendeeUserId=" + lendeeUserId
				+ ", lendStartDate=" + lendStartDate + "]";
	}
}
