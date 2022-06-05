package Que1;

public interface Y {
	void method1();
	default void method2() {
		System.out.println("This is default method of y interface");
	}
	static void method3() {
		System.out.println("Thid is static method of y interface");
	}
}
