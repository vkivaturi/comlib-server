package com.comlib.server.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//User access represents the communities to which a user has access to. This is a general access to add or lend books.

@Entity
public class UserAccess {
	
	private @Id @GeneratedValue Long userAccessId;
	private Long userId;
	private Long communityId;
	private boolean isAccessValid;
	private String accessStartDate;
	private String accessEndDate;
	private String accessProviderUserId;
	
	public UserAccess() {
		super();
	}
	
	public UserAccess(Long userAccessId, Long userId, Long communityId, boolean isAccessValid, String accessStartDate,
			String accessEndDate, String accessProviderUserId) {
		super();
		this.userAccessId = userAccessId;
		this.userId = userId;
		this.communityId = communityId;
		this.isAccessValid = isAccessValid;
		this.accessStartDate = accessStartDate;
		this.accessEndDate = accessEndDate;
		this.accessProviderUserId = accessProviderUserId;
	}
	
	public Long getUserAccessId() {
		return userAccessId;
	}
	public void setUserAccessId(Long userAccessId) {
		this.userAccessId = userAccessId;
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
	public boolean isAccessValid() {
		return isAccessValid;
	}
	public void setAccessValid(boolean isAccessValid) {
		this.isAccessValid = isAccessValid;
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
	public String getAccessProviderUserId() {
		return accessProviderUserId;
	}
	public void setAccessProviderUserId(String accessProviderUserId) {
		this.accessProviderUserId = accessProviderUserId;
	}
	
	@Override
	public String toString() {
		return "UserAccess [userAccessId=" + userAccessId + ", userId=" + userId + ", communityId=" + communityId
				+ ", isAccessValid=" + isAccessValid + ", accessStartDate=" + accessStartDate + ", accessEndDate="
				+ accessEndDate + ", accessProviderUserId=" + accessProviderUserId + "]";
	}
}
