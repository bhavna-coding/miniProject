package com.capgemini.cg.service;

import com.capgemini.cg.bean.CustomerBean;

public interface AccountService {

	void validateUserName(String name);

	void validateAge(int age);

	void createAccount(CustomerBean customer);

	void showBalance(Account account);

	void transferFund();

	void addMoney(dao d1, int amount);

}
