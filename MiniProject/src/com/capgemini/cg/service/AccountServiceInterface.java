package com.capgemini.cg.service;

import com.capgemini.cg.ui.CustomerBean;

public interface AccountServiceInterface {

	void validateUserName(String name);

	void validateAge(int age);

	public void createAccount(CustomerBean user);

	void transferFund(int acc1, int acc2);

	void addMoney(int acc, int amount);

	void showBalance(int acc);

}
