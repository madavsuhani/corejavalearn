package Multi_level;

public class Mainclass {

	public static void main(String[] args) {
		
		dept d=new dept();
		d.setColid(101);
		d.setCname("ARMIET");
		d.setColloc("Mumabi");
		d.setDeptid(190);
		d.setDeptname("comps");
		
		Student  s=new Student();
		s.setStudid(456);
		s.setStudname("Suhani");
		
		System.out.println("College ID:-"+d.getColid());
		System.out.println("College Name:-"+d.getCname());
		System.out.println("College Location:-"+d.getColloc());
		
		System.out.println("Department ID:-"+d.getDeptid());
		System.out.println("Department Name:-"+d.getDeptname());
		
		
		System.out.println("Student ID:-"+s.getStudid());
		System.out.println("Student Name:-"+s.getStudname());
		

	}

}
