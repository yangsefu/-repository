package com.clive.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.clive.dao.BankDao;
import com.clive.service.BankService;
@Service
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDao bankDao;
	@Transactional(isolation=Isolation.DEFAULT)
	@Override
	public void transfer(String sName, String tName, int money) {
//		transfer里的逻辑应该成败一体 有一条出错就应该判定失败 回到初始状态
//		用sql事务来管理
		bankDao.outMoney(sName, money);
		bankDao.inMoney(tName, money);

	}

}
