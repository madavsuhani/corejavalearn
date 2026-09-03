package bankdomain_methodoverriding;

public class SBI_Bank extends bank {
	
	public void calculateInterest(double principal,double time)
	{
		double rate=5.6;
		double interest=(principal*time*rate)/100;
		System.out.println("SBI Bank Interest:-"+interest);
	}

}
