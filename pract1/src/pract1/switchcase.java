package pract1;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice \n.JAN \n.Feb \n.MAR");
		
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("JAN");
			break;
			
		case 2:
			System.out.println("FEB");
			break;
			
		case 3:
			System.out.println("MAR");
			break;
			
			default:
				System.out.println("Invalid Choice");
				break;
				
		}
	}

}
