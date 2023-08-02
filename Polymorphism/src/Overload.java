/*
 * Polymorphism are of two type
 * -->Compile time polymorphism---Method overloading, operator overloading
 * -->Runtime Polymorphism--Method overriding
 * 
 * Note--> Java does not support compile time polymorphism
 * 
 * GOLDEN RULE-2
 * Method Overloading--->Whenever multiple method with the same name but arguments is different
 * so this concept is known as method overloading.
 */
public class Overload {
	void add(int x) {
		System.out.println(x);
	}
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	void add(int x, int y, int z, int a) {
		System.out.println(x+y+z-a);
	}

	public static void main(String[] args) {
		Overload o = new Overload();
		o.add(10);
		o.add(10,20);
		o.add(10,20,30);
		o.add(10,20,50,20);
		
	}

}
