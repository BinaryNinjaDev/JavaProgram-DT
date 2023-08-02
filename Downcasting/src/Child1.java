//you get back child reference id in parent reference variable

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
		 System.out.println("display from child");
	 }

	public static void main(String[] args) {
		Base1 c1 = new Child1();
		c1.show();//upcasting
		Child1 c2 = (Child1)c1;//downcasting
		c2.display();
	}

}
