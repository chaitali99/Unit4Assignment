package Que1;

public class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	
	public void printSalary() {
		System.out.println(this.salary);
	}


	public Member(String name, int age, String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	
	
}
