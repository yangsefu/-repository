package com.clive.service;

public interface BankService {
	/**
	 * 
	 * @param sName 转账人的名称
	 * @param tName 接收人的名称
	 * @param money 金额
	 * 转账方法+
	 * 
	 */
 void transfer(String sName,String tName,int money);
}
