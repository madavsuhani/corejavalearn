package interfacedemo;

public class childClass implements inter1,inter2{

	@Override
	public void mul(int a, int b) {
		System.out.println("mul is"+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("div is"+(a/b));
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("add is"+(a+b));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("mul is"+(a-b));
	}

}
