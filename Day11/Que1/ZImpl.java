package Que1;

public class ZImpl implements Z{

	@Override
	public void funA() {
		// TODO Auto-generated method stub
		System.out.println("inside funA of ZImpl");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Inside method1 of ZImpl");
	}

	@Override
	public void funZ() {
		// TODO Auto-generated method stub
		System.out.println("inside funcZ of ZImpl");
	}
	
	@Override
	public void funB() {
		System.out.println("This id default method of x interface call from ZImpl");
	}
	

}
