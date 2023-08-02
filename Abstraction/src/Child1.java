//abstract class
//interface
abstract class Base1 {
	int x;
	int y;
	
	void show() {
		System.out.println(x);
		System.out.println(y);
	}
	abstract void display();
}
class Child1 extends Base1{
	void get(int x, int y) {
		this.x=x;
		this.y=y;
	}
	void display() {
		System.out.println("display from child");
	}

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.get(10, 20);
		c1.show();
		c1.display();

	}

}
