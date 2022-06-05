package Que4;

public class Main {
	public static void main(String [] args) {
		Animal[] a1=new Animal[3];
		a1[0]=new Dog();
		a1[0].makeNoise();
		System.out.println("Called from object 1");
		Dog d=(Dog)a1[0];
		d.eat();
		d.walk();
		
		a1[1]=new Cat();
		a1[1].makeNoise();
		System.out.println("Called from object 2");
		Cat c=(Cat) a1[1];
		c.eat();
		c.walk();
		
		a1[2]=new Tiger();
		a1[2].makeNoise();
		System.out.println("Called from object 3");
		Tiger t=(Tiger)a1[2];
		t.eat();
		t.walk();
	}

}
