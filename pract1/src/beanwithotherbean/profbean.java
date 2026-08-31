package beanwithotherbean;

public class profbean {
	
	private int proid;
	private String profname;
	private personbean pb;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProfname() {
		return profname;
	}
	public void setProfname(String profname) {
		this.profname = profname;
	}
	public personbean getPb() {
		return pb;
	}
	public void setPb(personbean pb) {
		this.pb = pb;
	}
}