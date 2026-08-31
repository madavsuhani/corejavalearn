package pract1;

import java.util.Scanner;

public class pinverify {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
	String pin1="12345";
	
	System.out.println("enter your pin");
	String pin2=sc.next();
	
	for (int i=1;i<=3;i++)
	{
		if(i<=2)
		{
			if(pin1.equals(pin2))
			{
				System.out.println("pin is valid");
				break;
			}
			else
			{
				System.out.println("pin is invalid...Please try again");
				pin2=sc.next();
				
			}
		}
		else if(i==3)
		{
			if(pin1.equals(pin2))
			{
				System.out.println("pin is valid");
				break;
			}
			else
			{
				System.out.println("Acc is Blocked......");
			}
		}
			
	}
	
	
		
		

	}

}
