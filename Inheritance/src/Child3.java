/*
 * GOLDEN RULE-4
 * Data Hiding--->whenever the parent class and child class both are having same data member than this concept is known as Data hiding
 */
class Base3 {
	 int x = 10;
}
class Child3 extends Base3{
	int x = 20;
	
	void show() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}


	public static void main(String[] args) {
		Child3 c1 = new Child3();
		c1.show();

	}

}
