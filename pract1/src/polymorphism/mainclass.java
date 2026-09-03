package polymorphism;

public class mainclass {

	public static void main(String[] args) {
		parent cp=new child();
		
		cp.Op();
		
		cp=new parent();
		cp.Op();

	}

}
