package com.capgemini.cg.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.cg.dao.AccountDAOImpl;
import com.capgemini.cg.ui.CustomerBean;

public class AccountServiceImpl implements AccountServiceInterface {

	AccountDAOImpl dao = new AccountDAOImpl();

	String userNamePattern = "[A-Za-z] {25}";
	String agePattern = "[21-100]";

	public void createAccount(CustomerBean customer) {
		dao.storeIntoMap(customer);
	}

	public void validateUserName(String name) {
		Pattern p = Pattern.compile(userNamePattern);
		Matcher m = p.matcher(name);
	}

	public void validateAge(int age) {

		Pattern p = Pattern.compile(agePattern);
		Matcher m1 = p.matcher(Integer.toString(age));
	}

	public void addMoney(int acc, int amount) {
		dao.addMoney(acc, amount);
	}

	public void showBalance(int acc) {
		dao.showBalance(acc);
	}

	public void transferFund(int acc1, int acc2) {
		dao.transferFund(acc1, acc2);
	}

}
