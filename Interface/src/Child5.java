interface Ey {
	default void show() {
		System.out.println("show from My");
	}
}
interface Ey1{
	default void show() {
		System.out.println("show from my1");
	}
}
class Child5 implements Ey,Ey1{
	public void show() {
		System.out.println("Show from child5");
	}

	public static void main(String[] args) {
		Ey m = new Child5();
		m.show();
		
		Ey1 m1 = new Child5();
		m1.show();
	}

}
