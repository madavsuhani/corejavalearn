package beanwithotherbean;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		personbean p=new personbean();
		System.out.println("person id:"+p.getPid());
		p.setPid(sc.nextInt());
		
		System.out.println("person name:"+p.getPname());
		p.setPname(sc.next());
		
		profbean pr=new profbean();
		pr.setProid(112);
		pr.setProfname("suhani");
		pr.setPb(p);
		
		System.out.println("Prof ID:-"+pr.getPb());
		System.out.println("Prof ID:-"+pr.getProfname());
		System.out.println(pr.getPb());
		
	}

}
