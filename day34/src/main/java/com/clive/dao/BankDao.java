package com.clive.dao;

public interface BankDao {
   /**
    * 减钱
    * @param name
    * @param money
    */
	void outMoney(String name,int money);
	/**
	 * 加钱
	 * @param name
	 * @param money
	 */
    void inMoney(String name,int money);
}
