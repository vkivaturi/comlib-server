package com.comlib.server.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//User book represents the books that a user has added to the library and willing to lend to others.
//This book listing by user is community specific.

@Entity
public class UserBook {
	
	private @Id @GeneratedValue Long userBookId;
	private Long userId;
	private Long communityId;
	private boolean isAvailable;
	private Long lendeeUserId;
	private String lendStartDate;
	
	public UserBook() {
		super();
	}
	
	public UserBook(Long userBookId, Long userId, Long communityId, boolean isAvailable, Long lendeeUserId,
			String lendStartDate) {
		super();
		this.userBookId = userBookId;
		this.userId = userId;
		this.communityId = communityId;
		this.isAvailable = isAvailable;
		this.lendeeUserId = lendeeUserId;
		this.lendStartDate = lendStartDate;
	}
	
	public Long getUserBookId() {
		return userBookId;
	}
	public void setUserBookId(Long userBookId) {
		this.userBookId = userBookId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getCommunityId() {
		return communityId;
	}
	public void setCommunityId(Long communityId) {
		this.communityId = communityId;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Long getLendeeUserId() {
		return lendeeUserId;
	}
	public void setLendeeUserId(Long lendeeUserId) {
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
		return "UserBook [userBookId=" + userBookId + ", userId=" + userId + ", communityId=" + communityId
				+ ", isAvailable=" + isAvailable + ", lendeeUserId=" + lendeeUserId + ", lendStartDate=" + lendStartDate
				+ "]";
	}	
}
