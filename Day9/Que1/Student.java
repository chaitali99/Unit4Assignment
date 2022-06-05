package Que1;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	@Override
	public String toString() {
		return "Roll: "+roll+"\nName: "+name+"\n"+"Marks: "+marks+"\n"+"Grade: "+grade;
	}
	
	public void displayDetails(Object obj) {
		
		System.out.println(obj);	
		
	}
	
	
	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	
	
	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public char calculateGrade(int marks) {
		if(marks>=500) {
			return 'A';
		}
		else if(marks>=400) {
			return 'B';
		}else {
			return 'B';
		}
	}
}
