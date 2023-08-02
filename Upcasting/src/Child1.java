//UPCASTING---->whenever the parent class reference variable hold the child class reference id this concept is known as UPCASTING
class Base1 {
	void show() {
		System.out.println("show from the base");
	}
}
class Child1 extends Base1{
	void show() {
		System.out.println("show from child");
	}
	void display() {
		System.out.println("Display from child");
	}

	public static void main(String[] args) {
		Base1 c1 = new Child1();//upcasting
		c1.show();
		//c1.display();

	}

}
