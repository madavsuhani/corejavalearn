package single_level;

public class MainClass {

	public static void main(String[] args) {
		
		//protected access modifier can be accessed only in current package
		//where parent class is connected with child class using extends keyword
		
		
		dept d=new dept();
		d.setColid(101);
		d.setCname("ARMIET");
		d.setColloc("Mumabi");
		d.setDeptid(190);
		d.setDeptname("comps");
		
		
		System.out.println("College ID:-"+d.getColid());
		System.out.println("College Name:-"+d.getCname());
		System.out.println("College Location:-"+d.getColloc());
		
		System.out.println("Department ID:-"+d.getDeptid());
		System.out.println("Department Name:-"+d.getDeptname());
		
		

	}

}
