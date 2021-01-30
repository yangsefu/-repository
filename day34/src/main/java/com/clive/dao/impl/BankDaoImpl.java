package com.clive.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.clive.dao.BankDao;
@Repository
public class BankDaoImpl implements BankDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void outMoney(String name, int money) {
		int updata = jdbcTemplate.update("UPDATE bank SET money = money - ? WHERE username = ?",money,name);

	}

	@Override
	public void inMoney(String name, int money) {
		int update = jdbcTemplate.update("UPDATE bank SET money = money + ? WHERE username = ?",money,name);

	}

}
