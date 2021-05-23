package com.comlib.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comlib.server.dao.UserDao;
import com.comlib.server.entity.User;
import com.comlib.server.entity.UserAccess;
import com.comlib.server.entity.UserBook;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public UserService() {
		super();
	}

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	public void addUser() {
		log.info("Inside add new user");
		
		User user = new User("test@eample.com", "Ting tong", "AJHGSJHAIWHKJ<KAHSAJ", true);
		userDao.add(user);
	}

	public void addUserAccess() {
		log.info("Inside add new user access");
		
		UserAccess useraccess = new UserAccess(123, 456, true,"", "", 232);
		userDao.addAccess(useraccess);
	}

	public void addUserBook() {
		log.info("Inside add new user book");
		
		UserBook userbook = new UserBook(123, 456, 1232, true, true,123, "");
		userDao.addUserBook(userbook);;
	}

}
