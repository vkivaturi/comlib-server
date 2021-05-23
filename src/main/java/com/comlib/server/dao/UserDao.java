package com.comlib.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comlib.server.entity.User;
import com.comlib.server.entity.UserAccess;
import com.comlib.server.entity.UserBook;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public UserDao() {
		super();
	}

	public void add(User user) {

		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
		String insertSql = "insert into user (email, name, password, isActive) values (:email, :name, :password, :isActive);";

		namedParameterJdbcTemplate.update(insertSql, paramSource);

	}

	public void addAccess(UserAccess useraccess) {

		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(useraccess);
		String insertSql = "insert into useraccess (userId, communityId, isActive, accessStartDate, accessEndDate, accessProviderUserId) values (:userId, :communityId, :isActive, :accessStartDate, :accessEndDate, :accessProviderUserId);";

		namedParameterJdbcTemplate.update(insertSql, paramSource);

	}

	public void addUserBook(UserBook userbook) {

		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(userbook);
		String insertSql = "insert into userbook (userId, communityId, bookId, isActive, isAvailable, lendStartDate, lendeeUserId) values (:userId, :communityId, :bookId, :isActive, :isAvailable, :lendStartDate, :lendeeUserId);";

		namedParameterJdbcTemplate.update(insertSql, paramSource);

	}

}
