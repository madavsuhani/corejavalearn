package beanwitharraylist;

public class Cousrebean {

	private int courseid;
	private String coursename;
	private double coursefees;
	
	
    Cousrebean(int id, String name, double fees) 
	{	
		this.courseid = id;
		this.coursename = name;
		this.coursefees = fees;
	}


	@Override
	public String toString() {
		return "Cousrebean [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
	}
   


	
}

