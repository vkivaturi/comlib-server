package com.comlib.server.entity;

//Community entity stores basic details of a community. A community can be an apartment complex, a colony, a college
//or any other logical group of people who live in close proximity and interact.

public class Community {
	
	private int id;
	private String name;
	private String locality;
	private String city;
	private String pinCode;
	private String adminUser;
		
	public Community() {
		super();
	}

	public Community(String name, String locality, String city, String pinCode, String adminUser) {
		super();
		this.name = name;
		this.locality = locality;
		this.city = city;
		this.pinCode = pinCode;
		this.adminUser = adminUser;
	}

	public int getCommunityId() {
		return id;
	}
	public void setCommunityId(int communityId) {
		this.id = communityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getAdminUser() {
		return adminUser;
	}
	public void setAdminUser(String adminUser) {
		this.adminUser = adminUser;
	}
	@Override
	public String toString() {
		return "Community [communityId=" + id + ", name=" + name + ", locality=" + locality
				+ ", city=" + city + ", pinCode=" + pinCode + ", adminUser=" + adminUser + "]";
	}
	
}
