package Que2;
import java.util.*;
public class Demo {
	public boolean validate(String name,String mob,String adhar) {
		
		
		
		if(name.matches("[a-zA-Z]*")&& mob.matches("[6789][0-9]{9}")&&adhar.matches("[1456][0-9]{11}"))	{
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		Scanner sc=new Scanner(System.in);
		Citizen c1=new Citizen();
		
		System.out.print("Enter name: ");
		c1.setName(sc.next());
		
		System.out.print("Enter adhar number");
		c1.setAdharNumber(sc.next());
		
		System.out.print("Enter mobile number");
		c1.setMobileNumber(sc.next());
		
		if(d1.validate(c1.getName(), c1.getMobileNumber(), c1.getAdharNumber())) {
			System.out.println("Name: "+c1.getName());
			System.out.println("Adhar Number: "+c1.getAdharNumber());
			System.out.println("Mobile number: "+c1.getMobileNumber());
		}else {
			System.out.println("Invalid credential....");
		}
		
	}
}
