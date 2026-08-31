package pract1;

public class constDemo {

	constDemo(int a,int b)
	{
		 
		System.out.println("Addition"+(a+b));
		
	}
	
	public void sub()
	{
		int a=10,b=5;
		System.out.println("SUb "+(a-b));
	}
	
	public static void main(String[]args) {
		constDemo c=new constDemo(15,5);
		c.sub();
	}
}
