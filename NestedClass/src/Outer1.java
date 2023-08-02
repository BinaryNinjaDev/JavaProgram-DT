//Static ke andar non-static ho sakta hai method ya initilizaton
 class Outer1 {
	 int x = 10;
	 static int y = 20;
	 
	 static class Inner{
		 int z = 80;
		 void show() {
			 //System.out.println(x);
			 System.out.println(y);
			 System.out.println(z);
		 }
			 public static void main(String args[]) {
				 System.out.println("Main method from inner class");
			 
		 }
	 }

	public static void main(String[] args) {
		System.out.println("main method start hua hai");
        Inner i = new Inner();
        i.show();
	}

}
