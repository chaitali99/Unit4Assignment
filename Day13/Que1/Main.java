package Que1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Start of main...");
		
		Scanner sc=new Scanner(System.in);
		
		try {
			int num1 = 0,num2 = 0,num3=0;

				try {
					System.out.println("Enter the num1");
					num1=sc.nextInt();
				}
				
				catch(InputMismatchException e) {
					System.out.println("Please enter valid number");
				}
				try {
					System.out.println("Enter the num2");
					num2=sc.nextInt();
				}
				
				catch(ArithmeticException e) {
					System.out.println("num2 should not be 0");
				}
	
			
			String message=null;
			num3=num1/num2;
			if(num3>10) {
				message="welcome to Exception handling";

			}
			System.out.println("Message is: "+message.toUpperCase());
		}
		
		
		catch(Exception e) {
			System.out.println("String is null");
		}
		
		System.out.println("End of main...");
	}
}
