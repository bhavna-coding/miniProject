package com.capgemini.cg.dao;

import java.util.HashMap;

import com.capgemini.cg.bean.CustomerBean;

public class AccountDAOImpl implements AccountDAO {

	static int accNumber = 100;

	public void storeIntoMap(CustomerBean customer) {

		HashMap<Integer, CustomerBean> hm = new HashMap();
		hm.put(accNumber, customer);
		accNumber++;
		System.out.println("Account succesfully created with Account num: " + accNumber);
		System.out.println(hm.values());
	}

	public void display() {

	}

}
