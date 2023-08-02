//Finally
 class DemoExce4 {
	public static void main(String[] args) {
		try {
			int x = 10/2;
			System.out.println(x);
		}
		catch(ArithmeticException ae) {
			System.out.println("zero allowed nahii hai");
		}
		finally {
			System.out.println("ye hamesha chalega bhai");
		}
	}

}
