package pract1;

import java.util.Scanner;

public class mainClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

	EmpBean emp=new EmpBean();
	
	System.out.println("Enter EMP ID:-");
	emp.setEmpid(sc.nextInt());
	
	System.out.println("Enter EMP NAME:-");
	emp.SetEmpname(sc.next());
	
	System.out.println("Enter EMP SALARY:-");
	emp.SetEmpsal(sc.nextDouble());
	
	
	System.out.println("EMP ID:-"+emp.getEmpid());
	System.out.println("EMP Name:-"+emp.getEmpname());
	System.out.println("EMP Salary:-"+emp.getEmpsal());
	
	

	
	
	
		
		
		
		
		
		
		
		
	}

}
