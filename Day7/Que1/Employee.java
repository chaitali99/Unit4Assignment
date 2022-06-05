package Que1;

public class Employee extends Member{
    String specialisation;
    String department;
	public Employee(String name, int age, String phoneNumber, String address, double salary, String specialisation,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialisation = specialisation;
		this.department = department;
	}

    
}
