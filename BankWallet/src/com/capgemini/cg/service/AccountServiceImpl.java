package com.capgemini.cg.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.cg.bean.CustomerBean;
import com.capgemini.cg.dao.AccountDAOImpl;

public class AccountServiceImpl implements AccountService {
		
		AccountDAOImpl dao=new AccountDAOImpl();
		
		String userNamePattern="[A-Za-z] {20}";
		String agePattern="[20-100]";
		 public void createAccount(CustomerBean customer)
		{
			validateUserName(customer.getName());
			validateAge(customer.getAge());
			dao.storeIntoMap(customer);
		}
		public void validateUserName(String name)
		{
			
				Pattern p=Pattern.compile(userNamePattern);		
				Matcher m=p.matcher(name);		
		}
		public void validateAge(int age) 
		{
			{
				Pattern p=Pattern.compile(agePattern);
				Matcher m1=p.matcher(Integer.toString(age));
			}
					
			}
		public void showBalance(int acc) 
		{
		dao.showBalance(acc);
		}
	}


