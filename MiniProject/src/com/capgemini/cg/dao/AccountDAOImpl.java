package com.capgemini.cg.dao;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.cg.ui.CustomerBean;

public class AccountDAOImpl implements AccountDAOInterface {
	Scanner sc = new Scanner(System.in);
	static Integer accNumber = 100;
	CustomerBean user = new CustomerBean();
	// Account account=new Account();
	HashMap<Integer, CustomerBean> hmap = new HashMap<Integer, CustomerBean>();
	HashMap<Integer, CustomerBean> hmap1 = new HashMap<Integer, CustomerBean>();

	public void storeIntoMap(CustomerBean customer) {
		hmap.put(accNumber, customer);
		System.out.println("Account Has Been Created Successfully With Account Number: " + accNumber+".");
		accNumber++;
	}

	public void addMoney(int acc, int amount) {
		if (hmap.containsKey(acc))

		{
			int balance = hmap.get(acc).getAccbalance();
			hmap.get(acc).setAccbalance(balance + amount);
			System.out.println("The Money Has Been Successfully Added To Your Wallet.");
		} else {
			System.out.println("Oops! Account Cannot Be Found.");
		}
	}

	public void showBalance(int acc) {
		if (hmap.containsKey(acc)) {
			int balance = hmap.get(acc).getAccbalance();
			System.out.println("The Available Account Balance is : " + balance+".");
		}

	}

	public void transferFund(int acc1, int acc2) {
		int amount;
		System.out.println("Enter The Amount To Be Transferred : ");
		amount = sc.nextInt();
		int balance1 = hmap.get(acc1).getAccbalance();
		int balance2 = hmap.get(acc2).getAccbalance();
		hmap.get(acc1).setAccbalance(balance1 - amount);
		hmap.get(acc2).setAccbalance(balance2 + amount);
		System.out.println("Balance Transferred.");
		System.out.println("Balance In Source Account : " + hmap.get(acc1).getAccbalance()+".");
		System.out.println("Balance In Destination Account : " + hmap.get(acc2).getAccbalance()+".");
	}

}
