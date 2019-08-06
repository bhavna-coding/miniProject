package com.capgemini.cg.ui;

import java.util.Scanner;

import com.capgemini.cg.bean.AccountBean;
import com.capgemini.cg.bean.CustomerBean;
import com.capgemini.cg.service.AccountServiceImpl;


public class Starter {
	Scanner sc=new Scanner(System.in);
	AccountServiceImpl service=new AccountServiceImpl();
	AccountBean ac=new AccountBean();
	String name;
	int choice,age,accNo1,accNo2,amount;
	
	while(true) {
	System.out.println("******WELCOME THE BANKWALLET****** ");
	System.out.println("----------------------------------");
	System.out.println("1. Create An Account");
	System.out.println("2. Add Money To The Wallet");
	System.out.println("3. Show The Balance Amount");
	System.out.println("4. Transact Money To Another Account");
	System.out.println("----------------------------------");
	System.out.println("Please Enter Your Choice : ");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Please Enter Your Name:");
		name=sc.next();
		sc.nextLine();
		System.out.println("Please Enter Your Age: ");
		age=sc.nextInt();
		CustomerBean user=new CustomerBean();
		user.setName(name);
		user.setAge(age);
		service.createAccount(user);
		break;
	case 2:
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the account number associated with the name entered:");
		accNo1=sc.nextInt();
		System.out.println("Enter the amount you want to add:");
		amount=sc.nextInt();
		service.addMoney(accNo1, amount);
		
		break;
	case 3:
		System.out.println("Enter the Account number:");
		accNo1=sc.nextInt();
		service.showBalance(accNo1);
		break;
	case 4:
		System.out.println("Enter source account:");
		accNo1=sc.nextInt();
		System.out.println("Enter the destination account:");
		accNo2=sc.nextInt();
		service.transferFund(accNo1,accNo2);
}
	}
}
}


}
	