package com.comlib.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comlib.server.dao.CommunityDao;
import com.comlib.server.entity.Community;

@Service
public class CommunityService {

	@Autowired
	CommunityDao communityDao;

	public CommunityService() {
		super();
	}

	private static final Logger log = LoggerFactory.getLogger(CommunityService.class);

	public void addNewCommunity() {
		log.info("Inside add new community");
		Community community = new Community("Aparna Cyberlife", "Nallagandla", "Hyderabad", "500019",
				"test@example.com");
		communityDao.add(community);
	}

}
