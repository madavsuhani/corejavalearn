package hierarchical;

public class main {

	public static void main(String[] args) {
		
		
		dept d = new dept();
		d.setColid(101);
		d.setCname("ARMIET");
		d.setColloc("Mumabi");
		d.setDeptid(190);
		d.setDeptname("comps");
		
		stud s = new stud();
		s.setStudid(456);
		s.setStudname("Suhani");
		
		prof p= new prof();
		p.setProid(4566);
		p.setProfname("dkdn");
		
		System.out.println("College ID:-"+d.getColid());
		System.out.println("College Name:-"+d.getCname());
		System.out.println("College Location:-"+d.getColloc());
		
		System.out.println("Department ID:-"+d.getDeptid());
		System.out.println("Department Name:-"+d.getDeptname());
		
		
		System.out.println("Student ID:-"+s.getStudid());
		System.out.println("Student Name:-"+s.getStudname());
		

		System.out.println("professor  ID:-"+p.getProid());
		System.out.println("professor Name:-"+p.getProfname());
	}

}
