//MULTIPLE INHERITANCE CAN BE ACHIEVED BY INTERFACE

interface Dy {
	static void show() {
		System.out.println("Show from my");
	}
}
interface Dy1{
	static void show() {
		System.out.println("show from my1");
	}
}
class Child4 implements Dy,Dy1{

	public static void main(String[] args) {
		Dy.show();
		Dy1.show();
	}

}
