package Que1;

public class Manager extends Member{
	String specialization;
	String department;
//	public Manager(String name, int age, String phoneNumber, String address, double salary) {
//		super(name, age, phoneNumber, address, salary);
//	}
	public Manager(String name, int age, String phoneNumber, String address, double salary, String specialization,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
		this.department = department;
	}
	
	
}
