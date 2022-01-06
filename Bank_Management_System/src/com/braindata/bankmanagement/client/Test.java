package com.braindata.bankmanagement.client;


import java.io.IOException;
import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {
public static void main(String[] args) throws IOException {
	
	Scanner sc = new Scanner(System.in);
	
	Rbi bank = new Sbi();
	
	boolean b = true;
	while(b)
	{
		System.out.println("Enter 1 to Create Account:");
		System.out.println("Enter 2 to Display All bank Details:");
		System.out.println("Enter 3 to Deposite Money:");
		System.out.println("Enter 4 to Withdraw Money :");
		System.out.println("Enter 5 to Check balance:");
		System.out.println("Enter 6 to exit:");
		
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			bank.createAccount();
			break;
		}
		case 2:
		{
			bank.displayAllDetails();
			break;
		}
		case 3:
		{
			bank.depositeMoney();
			break;
		}
		case 4:
		{
			bank.withdrawal();
			break;
		}
		case 5:
		{
			bank.balanceCheck();
			break;
		}
		case 6:
		{
			b=false;
			break;
		}
		default:
		{
			System.out.println("Thank you for using this application");
		}
		
		}
	}
	
}
}
