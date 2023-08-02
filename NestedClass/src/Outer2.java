/*
 * Nested class non-static class me main method nahi hota hai
 * Non-static nested class ke andar me main method nahi hota hai
 * Normal non-static me static use nahi kar sakte
 */
 class Outer2 {
	 int x = 10;
	 static int y = 20;
	 class Inner{
		 int z = 80;
		 void show() {
			 //System.out.println(x);
			 System.out.println(y);
			 System.out.println(z);
		 }
	 }

	public static void main(String[] args) {
		System.out.println("main method se start hua hai" + y);
		Outer2 o = new Outer2();
		System.out.println(o.x);
		
		Outer2.Inner I = o.new Inner();
		I.show();
	}

}
