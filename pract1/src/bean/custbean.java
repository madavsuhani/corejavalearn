package bean;

public class custbean {

	private int custid;
	private String custname;
	private double bank_bal;
	private Bankbean cb;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBank_bal() {
		return bank_bal;
	}
	public void setBank_bal(double bank_bal) {
		this.bank_bal = bank_bal;
	}
	public Bankbean getCb() {
		return cb;
	}
	public void setCb(Bankbean cb) {
		this.cb = cb;
	}
	
	
	
	
}
