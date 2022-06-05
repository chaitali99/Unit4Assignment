package Que1;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static String reverseString(String str) {
		char[] ch=new char[str.length()];
		
		for( int i=str.length()-1,k=0;i>=0 && k<str.length();i--,k++) {
			ch[k]=str.charAt(i);
		}
		
		return new String(ch);
	 }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to reverse:");
		String originalString=sc.next();
		
		String result=reverseString(originalString);
		
		System.out.println("Original String is: "+originalString);
		System.out.println("Reversed String is: "+result);
	}

}
