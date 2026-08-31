package pract1;

import simplebean.empbean;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		empbean emp=new empbean();
		emp.setEmpid(101);
		emp.setEmpname("Alex");
		emp.setEmpsal(67670.00);
		
		
		System.out.println("EMP ID:-"+emp.getEmpid());
		System.out.println("EMP NAME:-"+emp.getEmpname());
		System.out.println("EMP SALARY:-"+emp.getEmpsal());
	}

}
