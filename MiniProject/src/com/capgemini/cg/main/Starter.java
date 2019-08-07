package com.capgemini.cg.main;
import java.util.Scanner;

import com.capgemini.cg.service.AccountServiceImpl;
import com.capgemini.cg.ui.AccountBean;
import com.capgemini.cg.ui.CustomerBean;
public class Starter {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		AccountServiceImpl service=new AccountServiceImpl();
		AccountBean ac=new AccountBean();		
		int choice,age,accNo1,accNo2,amount;
		String name;
		while(true) {
		System.out.println("****** WELCOME TO THE BANK-WALLET ******");
		System.out.println("--------------------------------------");
		System.out.println("1. CREATE AN ACCOUNT");
		System.out.println("2. ADD MONEY TO THE WALLET");
		System.out.println("3. SHOW THE AVAILABLE AMOUNT IN THE WALLET");
		System.out.println("4. TRANSFER MONEY TO THE OTHER ACCOUNT");
		System.out.println("--------------------------------------");
		System.out.println("Please Enter Your Choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Please Enter Your Name : ");
			name=sc.next();
			sc.nextLine();
			System.out.println("Please Enter Your Age : ");
			age=sc.nextInt();
			CustomerBean customer=new CustomerBean();
			customer.setName(name);
			customer.setAge(age);
			service.createAccount(customer);
			break;
		case 2:
			System.out.println("Please Enter Your Name:");
			name=sc.next();
			System.out.println("Please Enter The Account Number Associated With The Name You Entered:");
			accNo1=sc.nextInt();
			System.out.println("Please Enter The Amount You Want To Add:");
			amount=sc.nextInt();
			service.addMoney(accNo1, amount);
			
			break;
		case 3:
			System.out.println("Please Enter The Account Number:");
			accNo1=sc.nextInt();
			service.showBalance(accNo1);
			break;
		case 4:
			System.out.println("Please Enter The Source Account Number : ");
			accNo1=sc.nextInt();
			System.out.println("Please Enter The Destination Account Number : ");
			accNo2=sc.nextInt();
			service.transferFund(accNo1,accNo2);
	}
		}
	}
}

