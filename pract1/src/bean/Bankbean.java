package bean;

public class Bankbean {

	private int bankid;
	private String bankname;
	private String bankloc;
	
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankloc() {
		return bankloc;
	}
	public void setBankloc(String bankloc) {
		this.bankloc = bankloc;
	}
	@Override
	public String toString() {
		return "Bankbean [bankid=" + bankid + ", bankname=" + bankname + ", bankloc=" + bankloc + "]";
	}
	
	
}
