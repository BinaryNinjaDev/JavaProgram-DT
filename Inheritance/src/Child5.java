/*
 * RULES FOR FOLLOW ----> stronger to weaker not allowed
 * weaker to stronger alowed
 * 
 * ERROR---->ATTEMPTING TO ASSIGN WEAKER ACCESS PRIVILAGE WAS PUBLIC
 */
 class Base5 {
	 public void show() {
		 System.out.println("show from base");
	 }
 }
 class Child5 extends Base5{
	 void show() {
		 System.out.println("show from child");
	 }

	public static void main(String[] args) {
		Child5 c1= new Child5();
		c1.show();
	}

}
