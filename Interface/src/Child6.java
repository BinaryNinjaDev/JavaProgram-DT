interface Fy {
	void show();
}
interface Fy1{
	void show();
}
class Child6 implements Ey,Ey1{
	public void show() {
		System.out.println("show from child6");
	}

	public static void main(String[] args) {
		Ey m = new Child6();
		m.show();
		
		Ey1 m1 = new Child6();
		m1.show();
	}

}
