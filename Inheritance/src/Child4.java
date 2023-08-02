/*
 * GOLDEN RULE-5
 * METHOD HIDING--->Whenever the parent class and child class both are having same static method then this is known as method hiding
 */
class Base4 {
	static void show() {
		System.out.println("show from base");
	}
}
class Child4 extends Base4{
	static void show() {
		System.out.println("Show from child");
	}


	public static void main(String[] args) {
		Child4 c1 = new Child4();
		c1.show();

	}

}

