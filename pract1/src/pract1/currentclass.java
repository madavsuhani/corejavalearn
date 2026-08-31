package pract1;

import java.util.Scanner;

public class currentclass {

		int empid;
		String empname;
		double empsal;

		
		public void setEmpDetails()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter EMP ID");
			empid=sc.nextInt();
			
			System.out.println("enter EMP Name");
			empname=sc.next();
			
			System.out.println("enter EMP Salary");
			empsal=sc.nextDouble();
			
		}
		
		public void getEmpDetails()
		{
			System.out.println("EMP ID:-"+empid);
			System.out.println("EMP Name:-"+empname);
			System.out.println("EMP Salary:-"+empsal);
		
			
		
	}

}
