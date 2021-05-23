package com.comlib.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comlib.server.entity.Community;

@Repository
public class CommunityDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public CommunityDao() {
		super();
	}

	public void add(Community community) {
		
		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(community);
		String insertSql = "insert into community (name, locality, city, pinCode, adminUser) values (:name, :locality, :city, :pinCode, :adminUser);";

		namedParameterJdbcTemplate.update(insertSql, paramSource);

	}

}
