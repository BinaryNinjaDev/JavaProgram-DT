//NON-STATIC
interface By {
	default void show() {
		System.out.println("Show from interface");
	}
}
class Child2 implements By{
	public void show() {
		System.out.println("Show from child2");
	}

	public static void main(String[] args) {
		By m = new Child2();
		m.show();

	}

}
