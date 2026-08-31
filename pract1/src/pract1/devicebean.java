package pract1;

public class devicebean {
	
	private int deviceId;
	private String deviceName;
	private String deviceOS;
	private double kernalversion;
	private String Manf_Date;
	private double IMEI_code;
	private String Ram_Details;
	private String DeviceType;
	public String getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(String deviceType) {
		DeviceType = deviceType;
	}
	private String password;
	private String confirm_password;
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceOS() {
		return deviceOS;
	}
	public void setDeviceOS(String deviceOS) {
		this.deviceOS = deviceOS;
	}
	public double getKernalversion() {
		return kernalversion;
	}
	public void setKernalversion(double kernalversion) {
		this.kernalversion = kernalversion;
	}
	public String getManf_Date() {
		return Manf_Date;
	}
	public void setManf_Date(String manf_Date) {
		Manf_Date = manf_Date;
	}
	public double getIMEI_code() {
		return IMEI_code;
	}
	public void setIMEI_code(double d) {
		IMEI_code = d;
	}
	public String getRam_Details() {
		return Ram_Details;
	}
	public void setRam_Details(String ram_Details) {
		Ram_Details = ram_Details;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public void setManf_Date(int nextInt) {
		// TODO Auto-generated method stub
		
	}	
	
	

}
