/*
 * GOLDEN RULE-4
 * METHOD OVERRIDING--->whenever the parent class and child class both are having same method this concept is known as method overriding
 */
class Base2 {
	void show() {
		System.out.println("Show from base1");
	}
}
class Child2 extends Base2{
	void show() {
		System.out.println("Show from child1");
		super.show();
	}

	public static void main(String[] args) {
		Child2 c1 = new Child2();
		c1.show();

	}

}
