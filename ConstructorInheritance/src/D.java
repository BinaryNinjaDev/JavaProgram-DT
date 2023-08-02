 class A {
	 A(){
		 System.out.println("A");
	 }
 }
 class B extends A{
	 B(int x){
		 super();
		 System.out.println("B");
	 }
 }
 class D extends B{
	 D(){
		 super();
		 System.out.println("D");
	 }
	 D(int x){
		 super();
		 System.out.println(x);
	 }

	public static void main(String[] args) {
		new D();
		new D(10);

	}

}
