package Que1;

public class Demo {
	public static void main(String[] args) {
		ZImpl z1=new ZImpl();
		z1.funA();
		z1.method1();
		z1.funB();
		z1.funZ();
		
		
		X x1=new ZImpl();
		X.funC();
		x1.funB();
		
		Y y1=new ZImpl();
		Y.method3();
		y1.method2();
		
	}
}
