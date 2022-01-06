package com.braindatawire.companymanagement.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.braindatawire.companymanagement.model.Employee;
import com.braindatawire.companymanagement.model.Manager;
import com.braindatawire.companymanagement.model.Project;
import com.braindatawire.companymanagement.model.Team;
import com.braindatawire.companymanagement.service.Persistant;

public class Araybhatt implements Persistant
{
			
			
			List<Project>list1 = new ArrayList<>();
			
			List<Manager>list2 = new ArrayList<>();
						
			List<Team>list3 = new ArrayList<>();
						
			List<Employee>list4 = new ArrayList<>();
			
			int count = 0;
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			
			Scanner sc = new Scanner(System.in);
			
	public void addProject() 
	{
		Project p = new Project();
		
		System.out.println("------Enter Project Details-----");
	
		System.out.println("Enter Project Id:");
		int pid = sc.nextInt();
		p.setPid(pid);
		
		System.out.println("Enter Project Name:");
		String pname = sc.next();
		p.setPname(pname);
		
		list1.add(p);
		
		count++;
		 
	}

	public void viewProject() 
	{
		if(count>0)
		{
			Iterator itr = list1.iterator();
			while(itr.hasNext())
			{
				Project p = (Project)itr.next();
				System.out.println("Project Id: "+p.getPid());
				System.out.println("Project Name : "+p.getPname());
			}
		}
		else
		{
			System.out.println("Please Enter data properly");
		}
		
	}

	public void addManager() 
	{
		Manager m = new Manager();
		if(count>0)
		{
		System.out.println("------Enter Manager Details-----");
	
		System.out.println("Enter Manager Id:");
		int mid = sc.nextInt();
		m.setMid(mid);
		
		System.out.println("Enter Manager Name:");
		String mname = sc.next();
		m.setMnane(mname);
		
		System.out.println("Enter Project Id:");
		int i1= sc.nextInt();
		
		Iterator<Project>itr = list1.iterator();
		while(itr.hasNext())
		{
			Project p =itr.next();
			int i2 = p.getPid();
			if(i1 == i2)
			{
				m.setPr(p);
				list2.add(m);
				System.out.println("Project Id added successfully....!!!");
			}
			else
			{
				System.out.println("Please Enter data properly");
			}
			
		}	
		count1++;		
	}
	}

	public void viewManager()
	{
		if(count1>0)
		{
			Iterator<Manager> itr = list2.iterator();
			while(itr.hasNext())
			{
				Manager m = itr.next();
				System.out.println("Manager Id: "+m.getMid());
				System.out.println("Manager Name : "+m.getMnane());
				System.out.println("Project Id is:"+m.getPr().getPid());
				System.out.println("Project Name is:"+m.getPr().getPname());
			}
			System.out.println("-----------------------------------------------");
			
		}
		else
		{
			System.out.println("Please Enter Manager data properly");
		}
		
		
	}

	public void addTeam()
	{
		Team t = new Team();
		if(count1>0)
		{
		
		System.out.println("------Enter Team Details-----");
	
		System.out.println("Enter Team Id:");
		int tid = sc.nextInt();
		t.setTid(tid);
		
		System.out.println("Enter Team Name:");
		String tname = sc.next();
		t.setTname(tname);
		
		System.out.println("Enter Manager Id:");
		int m1 = sc.nextInt();
		
		Iterator<Manager>itr = list2.iterator();
		while(itr.hasNext())
		{
			Manager m = itr.next();
			int m2 = m.getMid();
			if(m1 == m2)
			{
				t.setM(m);
				list3.add(t);
				System.out.println("Manager Id Added Successfully......!!!");
			}
			else
			{
				System.out.println("Please Enter data Properly ");
			}
		}		
		count2++;
	}
		
	}

	public void viewTeam() 
	{
		if(count2>0)
		{
			Iterator<Team> itr = list3.iterator();
			while(itr.hasNext())
			{
				Team t = itr.next();
				System.out.println("Team Id: "+t.getTid());
				System.out.println("Team Name : "+t.getTname());
				System.out.println("Manager Id:"+t.getM().getMid());
				System.out.println("Manager Name:"+t.getM().getMnane());
				System.out.println("Project Id:"+t.getM().getPr().getPid());
				System.out.println("Project Name:"+t.getM().getPr().getPname());
			}
			System.out.println("----------------------------------------------------------------");
		}
		else
		{
			System.out.println("Please Enter Batch data Properly");
		}
		
	}

	public void addEmployee() 
	{
		Employee e = new Employee();
		if(count2>0)
		{
	
		System.out.println("------Enter Employee Details-----");
	
		System.out.println("Enter Employee Id:");
		int eid = sc.nextInt();
		e.setEid(eid);
		
		System.out.println("Enter Employee Name:");
		String ename = sc.next();
		e.setEname(ename);
		
		System.out.println("Enter Employee Salary:");
		double salary = sc.nextDouble();
		e.setSalary(salary);
		
		System.out.println("Enter Team Id:");
		int t1 = sc.nextInt();
		
		Iterator<Team>itr = list3.iterator();
		while(itr.hasNext())
		{
			Team t = itr.next();
			int t2 = t.getTid();
			if(t1 == t2)
			{
				e.setTeam(t);
				list4.add(e);
				System.out.println("Team Id Added Successfully!");
			}
			else
			{
				System.out.println("Please Enter data Properly");
			}
		}
		count3++;
		}	
		
	}

	public void viewEmployee() 
	{
		if(count3>0)
		{
			Iterator<Employee> itr = list4.iterator();
			while(itr.hasNext())
			{
				Employee emp = itr.next();
				System.out.println("Employee Id: "+emp.getEid());
				System.out.println("Employee Name : "+emp.getEname());
				System.out.println("Employee Salary:"+emp.getSalary());
				System.out.println("Team Id:"+emp.getTeam().getTid());
				System.out.println("Team Name:"+emp.getTeam().getTname());
				System.out.println("Manager Id:"+emp.getTeam().getM().getMid());
				System.out.println("Manager Name:"+emp.getTeam().getM().getMnane());
				System.out.println("Project Id:"+emp.getTeam().getM().getPr().getPid());
				System.out.println("Project Name:"+emp.getTeam().getM().getPr().getPname());
			}
			System.out.println("------------------------------------------------------------------------");
		}
		else
		{
			System.out.println("Enter Employee  data Properly");
		}
		System.out.println("Employee data Added Successfuly......!!!");
	}
}