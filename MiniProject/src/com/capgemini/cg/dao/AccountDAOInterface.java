package com.capgemini.cg.dao;

import com.capgemini.cg.ui.CustomerBean;

public interface AccountDAOInterface {
	public void storeIntoMap(CustomerBean user);

	void addMoney(int acc, int amount);

	void showBalance(int acc);

	void transferFund(int acc1, int acc2);

}
