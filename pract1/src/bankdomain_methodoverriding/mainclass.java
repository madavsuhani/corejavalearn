package bankdomain_methodoverriding;

import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principal");
		double principal=sc.nextDouble();
		
		System.out.println("Enter time required");
		double time=sc.nextDouble();

		bank b;
		
		b=new SBI_Bank();
		b.calculateInterest(principal,time);
		
		b=new ICICI_bank();
		b.calculateInterest(principal,time);
		
	}

}
