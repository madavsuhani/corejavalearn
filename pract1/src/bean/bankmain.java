package bean;

import java.util.Scanner;

public class bankmain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Bankbean b=new Bankbean();
		
		System.out.println("Enter Bank ID:-");
		b.setBankid(sc.nextInt());
		
		System.out.println("Enter Bank Name:-");
		b.setBankname(sc.next());
		
		System.out.println("Enter Bank Location:-");
		b.setBankloc(sc.next());
		
		System.out.println("Bank ID:- "+b.getBankid());
		System.out.println("Bank Name:- "+b.getBankname());
		System.out.println("Bank Loc:- "+b.getBankloc());
		
		Accbean ab=new Accbean();
		
		ab.setAacid(1222000);
		ab.setAccname("ban");
		ab.setBb(b);
		
		System.out.println("Acc ID:-"+ab.getAacid());
		System.out.println("ACC name:-"+ab.getAccname());
		System.out.println(ab.getBb());
		
		
		custbean cb=new custbean();
		
		cb.setCustid(15555);
		cb.setCustname("Suhani");
        cb.setCb(b);
		
		System.out.println("Cust ID:-"+cb.getCustid());
		System.out.println("Cust name:-"+cb.getCustname());
		System.out.println(cb.getCb());
		
		
		
	}

}
