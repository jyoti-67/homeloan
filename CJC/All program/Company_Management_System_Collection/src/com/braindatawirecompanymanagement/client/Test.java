package com.braindatawirecompanymanagement.client;

import java.util.Scanner;

import com.braindatawire.companymanagement.service.Persistant;
import com.braindatawire.companymanagement.serviceImpl.Araybhatt;

public class Test 
{
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 Persistant p = new Araybhatt();
		
		 while(true)
			{
				System.out.println("*******************************");
				System.out.println("Enter 1 to add Project Details:");
				System.out.println("Enter 2 to view Project Details:");
				System.out.println("Enter 3 to add Manager Details");
				System.out.println("Enter 4 to view Manager Details");
				System.out.println("Enter 5 to add Team Details");
				System.out.println("Enter 6 to view Team Details");
				System.out.println("Enter 7 to add Employee Details");
				System.out.println("Enter 8 to view Employee Details");
				System.out.println("Enter 9 to Exit:");
				
				int ch = sc.nextInt();
				switch(ch)
				{
				case 1:
				{
					p.addProject();
					break;
				}
				case 2:
				{
					p.viewProject();
					break;
				}
				case 3:
				{
					p.addManager();
					break;
				}
				case 4:
				{
					p.viewManager();
					break;
				}
				case 5:
				{
					p.addTeam();
					break;
				}
				case 6:
				{
					p.viewTeam();
					break;
				}
				case 7:
				{
					p.addEmployee();
					break;
				}
				case 8:
				{
					p.viewEmployee();
					break;
				}
				case 9:
				{
					System.out.println("Thank you for using Application");
					System.exit(0);
				}
				default:
				{
					System.out.println("Enter correct choice");
					break;
				}
				}
			}
			 
	}


	
}
