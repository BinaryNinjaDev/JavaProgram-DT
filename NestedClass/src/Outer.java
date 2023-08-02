/*
 * a.Static nested class----------------Static data member
 * b.non-static nested class-----------non static data member
 * c.local nested class----------------local variable
 * 
 * Static cheejo me non-static cheejo ko use nahii kar sakte
 * static class loading ke time par memory milti hai and non static ko jab object banta hai
 */
 class Outer {
	 int x=10;
	 static int y=20;
	 static class inner{
		 static void show() {
			 //System.out.println(x);
			 System.out.println(y);
		 }
	 }

	public static void main(String[] args) {
		System.out.println("main method se chala hai" + y);
	    inner.show();
	}

}
