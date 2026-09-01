package beanwitharraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Course ID, Course Name, Course Fees");
		
		Cousrebean cb=new Cousrebean(sc.nextInt(), sc.next(),sc.nextDouble());
		ArrayList<Cousrebean> a=new ArrayList<Cousrebean>();
		
		System.out.println("Enter Course ID, Course Name, Course Fees");
		a.add(new Cousrebean(sc.nextInt(), sc.next(),sc.nextDouble()));
		
		System.out.println("Enter Course ID, Course Name, Course Fees");
		a.add(new Cousrebean(sc.nextInt(), sc.next(),sc.nextDouble()));
		a.add(cb);
		
		Iterator<Cousrebean> iter=a.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
