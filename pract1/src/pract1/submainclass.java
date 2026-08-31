package pract1;

import java.util.Scanner;

public class submainclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		devicebean d=new devicebean();
		
		System.out.println("enter device id:-");
		d.setDeviceId(sc.nextInt());
		
		System.out.println("enter device name:-");
		d.setDeviceName(sc.next());
		
		System.out.println("enter device OS:-");
		d.setDeviceOS(sc.next());
		
		System.out.println("enter kernal version:-");
		d.setKernalversion(sc.nextDouble());
		
		System.out.println("enter Manf date :-");
		d.setManf_Date(sc.nextInt());
		
		System.out.println("enter IMEI Code:-");
		d.setIMEI_code(sc.nextInt());
		
		System.out.println("enter Ram Details:-");
		d.setRam_Details(sc.next());
		
		System.out.println("enter Device Type:-");
		d.setDeviceType(sc.next());
		
		System.out.println("enter Password:-");
		d.setPassword(sc.next());
		
		System.out.println("enter confirm password:-");
		d.setConfirm_password(sc.next());
		
		if(d.getPassword().equals(d.getConfirm_password()))
		{
			System.out.println("Device ID:-"+d.getDeviceId());
			System.out.println("Device name:-"+d.getDeviceName());
			System.out.println("Device OS:-"+d.getDeviceOS());
			System.out.println("Device kernal version:-"+d.getKernalversion());
			System.out.println("Device Manf date:-"+d.getManf_Date());
			System.out.println("Device IMEI Code :-"+d.getIMEI_code());
			System.out.println("Device Ram Details:-"+d.getRam_Details());
			System.out.println("Device type:-"+d.getDeviceType());
		}
		
		else
		{
			System.out.println("Password entered is incorrect");
		}



		
	}

}
