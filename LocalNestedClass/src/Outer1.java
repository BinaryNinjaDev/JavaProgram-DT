//How to access inner class in main method
 class Outer1 {
	 int x = 10;
	 static int y = 20;
	 
	 My display() {
		 class Inner implements My{
			 public void show() {
				 System.out.println(x);
				 System.out.println(y);
			 }
		 }
		 return new Inner();
	 }

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		My m = o.display();

	}

}
 interface My{
	 void show();
 }
