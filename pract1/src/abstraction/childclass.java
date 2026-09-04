package abstraction;

public class childclass extends abs {

	@Override
	public void display() {
		
		setEmpid(1023);
		setEmpname("ALex");
		setEmpsal(102933);
		
		System.out.println("EMp ID:-"+getEmpid());
		System.out.println("EMp ID:-"+getEmpname());
		System.out.println("EMp ID:-"+getEmpsal());
		
	}

}
