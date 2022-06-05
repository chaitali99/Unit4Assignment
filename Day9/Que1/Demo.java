package Que1;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Roll No:");
		int r=sc.nextInt();
		
		System.out.println("Enter Name:");
		String n=sc.next();
		
		System.out.println("Enter marks:");
		int m=sc.nextInt();
		
		Student s1=new Student(r,n,m);
		s1.setGrade(s1.calculateGrade(m));
		s1.displayDetails(s1);
		
	}
}
