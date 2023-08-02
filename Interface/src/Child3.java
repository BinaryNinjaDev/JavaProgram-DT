//DEFAULT
interface Cy {
	void show();
	}
class Child3 implements Cy{
	public void show() {
		System.out.println("show from child3");
	}
	
	public static void main(String[] args) {
		Cy m = new Child3();
		m.show();

	}

}
