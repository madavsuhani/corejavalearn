package pract1;

public class primenumber {

	public static void main(String[] args) {
		
		for (int i=1;i<=100;i++)
		{
			if(i==1)
			{
			}
			else
			{
				boolean flag=false;
				
				for (int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=true;
					}
				}
				if(flag==false)
				{
					System.out.println(i);
				}
			}
		}

			
		
	}

}
