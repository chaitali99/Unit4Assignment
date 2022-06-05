package Que1;

public interface X {
	void funA();
	default void funB() {
		System.out.println("This is default method of x interface");
	}
	
	static void funC() {
		System.out.println("This is static method of x interface");
	}

}
