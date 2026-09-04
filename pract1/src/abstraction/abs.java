package abstraction;

public abstract class abs {
//abstract class will always be the parent class 
	//abstract class will newer have java main method 
	//only in abstraction class we can have abstraction method 
	//abstraction class is denoted by the keyword abstract
	
	
	private int empid;
	private String empname;
	private double empsal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	
	public abstract void display();//concrete method 
	//method which is defined inside the abstract class
	//with abstract keyword is called as concrete method
}
