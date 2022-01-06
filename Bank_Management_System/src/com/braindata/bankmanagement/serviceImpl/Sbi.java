package com.braindata.bankmanagement.serviceImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi{
	

	Scanner sc = new Scanner(System.in);
	int count = 0;
	Account acc[]= new Account[100];
	

	public void createAccount() throws IOException {
		
		while(true)
		{
			Account a = new Account();
			
			System.out.println("Enter Account Number :");
			int accNo = sc.nextInt();
			a.setAccNo(accNo);
			
			System.out.println("Enter Account Holder name :");
			String name = sc.next();
			a.setName(name);
			
			System.out.println("Enter Account Holder mobile number : ");
			String mobNo = sc.next();
			a.setMobNo(mobNo);
			
			System.out.println("Enter Account Holder Adhar number :");
			String adharNo = sc.next();
			a.setAdharNo(adharNo);
			
			System.out.println("Enter Account Holder Gender :");
			String gender = sc.next();
			a.setGender(gender);
			
			System.out.println("Enter Account Holder Age :");
			int age= sc.nextInt();
			a.setAge(age);
			
			System.out.println("Enter Account Balance :");
			double balance = sc.nextDouble();
			a.setBalance(balance);
			
			File f = new File("C:\\users\\Balaji\\Desktop\\Bank_Management\\" +name +".txt");
			f.createNewFile();
			
			FileWriter f2 = new FileWriter(f);
			BufferedWriter br = new BufferedWriter(f2);
			br.write("Account number                :  " +accNo);
			br.newLine();
			br.write("Account name                  :  " +name);
			br.newLine();
			br.write("Account holder mobile number  :  " +mobNo);
			br.newLine();
			br.write("Account holder adhar number   :  " +adharNo);
			br.newLine();
			br.write("Account holder gender         :  " +gender);
			br.newLine();
			br.write("Account holder age            :  " +age);
			br.newLine();
			br.write("Account balance               :  " +balance);
			br.newLine();
			br.flush();
			System.out.println("----------------------------------------------------------");
			
			acc[count]= a;
			count++;
			
			
			String s=name+".txt";
			
			System.out.println("-------Account Added Successfully-------");
			
			System.out.println("Enter 1 to add more Account/ Enter 0 to exit:");
			
		
			int a1=sc.nextInt();
			if(a1==0)
			{
				break;
			}	
		}
					
	}

	public void displayAllDetails() throws IOException
	{
		File f1 = new File("C:\\Users\\Balaji\\Desktop\\Bank_Management");
		String s1[] = f1.list();
		
		for(int i =0; i<s1.length; i++)
		{
			String name = s1[i];
			System.out.println("content of"+name);
			
			FileReader fr = new FileReader("C:\\Users\\Balaji\\Desktop\\Bank_Management\\" +name);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			
			while(s!=null)
			{
				System.out.println(s);
				s = br.readLine();
			}
			
			System.out.println("-----------------------------");
		}
	}

	public void depositeMoney() throws IOException 
	{
		
			System.out.println("Enter account holder name to add balance:");
			String name = sc.next();
		
			String n = name +".txt";
		
			File f = new File("C:\\Users\\Balaji\\Desktop\\Bank_Management");
			String li[] = f.list();
			
			for(int i =0; i<li.length; i++)
			{
				if(li[i].equals(n))
				{
					File f2 = new File(f,n);
					FileReader fr = new FileReader(f2);
					BufferedReader br = new BufferedReader(fr);
					String s = br.readLine();
		
					String data[] = new String[100];
					int count = 0;
		
					while(s!=null)
					{
						
						s= br.readLine();
						data[count]=s;
						count++;
					}
		
					String h = data[count -2];
					String[] sd = h.split(" ");
					System.out.println("Current balance:" +sd[sd.length-1]);
					System.out.println("Enter the amount to deposite:");
					double amt = sc.nextInt();
		
					String j = sd[sd.length-1];
					double balance =Double.parseDouble(j);
					double up_balance = amt + balance;
		
					File f5 = new File(f,n);
					FileWriter fg = new FileWriter(f5,true);
					PrintWriter pg = new PrintWriter(fg);
					pg.append("Updated balance:" +up_balance );
					pg.flush();
		
					System.out.println("updated new balance:" +up_balance);
		
				}
			}
	}
		
//			System.out.println("Enter Account number to deposite Money:");
//		int accNo = sc.nextInt();
			
//			for(int i =0; i<count; i++)
//		{
//			int accno =acc[i].getAccNo();
				
//				if(accNo==accno)
//				{
//					System.out.println(" Enter amount you want to Deposite: ");
//					double amt = sc.nextDouble();
					
					
//					if(amt<100)
//					{
//						System.out.println("sorry amount not deposited to less than 100");
//						break;
//					}
//					double oldbalance = acc[i].getBalance();
					
//					System.out.println("Previous balance :" +oldbalance);
//					double newbalance = oldbalance + amt;
				
//					acc[i].setBalance(newbalance);
//					System.out.println("Updated balance :" +newbalance);
//					count++;
	//			}
				
//	}
//			if(count==0)
//			{
//				System.out.println("Entered account number is incorrect....");
//			}
	

public void withdrawal() throws IOException 
{
	
		System.out.println("Enter account holder name to Withdraw money : ");
		String name = sc.next();
	
		String n = name +".txt";
	
		File f = new File("C:\\Users\\Balaji\\Desktop\\Bank_Management\\");
	
		String li[] = f.list();
	
		for(int i = 0; i<li.length; i++)
		{
			if(li[i].equals(n))
			{
			
				File f2 = new File(f,n);	
				FileReader fr = new FileReader(f2);
				BufferedReader br = new BufferedReader(fr);
				String s = br.readLine();
	
				String data[] = new String[100];
				int count = 0;
	
				while(s!=null)
				{
					s= br.readLine();
					data[count]=s;
					count++;
				}
	
				String h = data[count -2];
				String[] sd = h.split(" ");
				System.out.println("Current balance  : " +sd[sd.length-1]);
				System.out.println("Enter the amount to Withdraw : ");
				double amt = sc.nextInt();
	
				String j = sd[sd.length-1];
				double balance = Double.parseDouble(j);
				double up_balance = 0;
	
				if(balance > amt)
				{
					up_balance = balance - amt;
					File f5 = new File(f,n);
					FileWriter fg = new FileWriter(f5,true);
					PrintWriter pg = new PrintWriter(fg);
					pg.append("Updated balance " +up_balance );
					pg.flush();
	
					System.out.println("updated new balance : " +up_balance);
	
				}
				else
				{
					System.out.println("Insufficient balance.....");
				}
	
			}
		
		}
	
	}
		
//		System.out.println("Enter account number to Withdraw cash:");
//		int accno = sc.nextInt();
		
//		for(int i =0; i<count; i++)
//		{
//			if(acc[i].getAccNo()==accno)
//			{
//				System.out.println("Enter amount to Withdraw:");
//				double amt = sc.nextDouble();
				
//				double balance = acc[i].getBalance();
//				if(amt > balance)
//				{
//					System.out.println("sorry your balance is less than your amount");
//					break;
//				}
//				balance = balance - amt;
//				acc[i].setBalance(balance);
				
//				System.out.println("Cash Withdraw.......!!!!!!!!");
				
//			}
//			else
//			{
//				System.out.println("Entered account number is incorrect");
//			}
			
//		}
//}

	public void balanceCheck() throws IOException
	{
		
			System.out.println("Enter account name to show balance :");
		
			String name = sc.next();
		
			String n = name + ".txt";
		
			File f = new File("C:\\Users\\Balaji\\Desktop\\Bank_Management\\");
		
			String li[] = f.list();
		
			for(int i = 0; i<li.length; i++)
			{
				if(li[i].equals(n))
				{
					File f2 = new File(f,n);
					FileReader fr = new FileReader(f2);
					BufferedReader br = new BufferedReader(fr);
					String s = br.readLine();
				
					String data[] = new String[100];
					int count = 0;
				
					while(s!=null)
					{
						s= br.readLine();
						data[count]=s;
						count++;
					}
				
					String h = data[count -2];
					String[] sd = h.split(" ");
					System.out.println("Current balance  :" +sd[sd.length-1]);
				}
			}
		}
	}	

//		System.out.println("Enter account number to Check balance:");
//		int accno = sc.nextInt();
		
//		for(int i =0; i<count; i++)
//		{
//			Account a = new Account();
//			if( acc[i].getAccNo()==accno)
//			{
//				System.out.println("Entered account number is correct:");
//				System.out.println("Balance is =" +((Account) acc[i]).getBalance());
//			}
//			else
//			{
//				System.out.println("Entered account number is incorrect:");
//			}
//		}
		
//	}

//}
