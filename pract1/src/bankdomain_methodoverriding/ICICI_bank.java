package bankdomain_methodoverriding;

public class ICICI_bank extends bank{

	public void calculateInterest(double principal,double time)
	{
		double rate=7;
		double interest=(principal*time*rate)/100;
		System.out.println("ICICI Bank Interest:-"+interest);
	}
}
