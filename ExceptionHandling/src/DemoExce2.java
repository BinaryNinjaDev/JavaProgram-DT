 class DemoExce2 {
	public static void main(String[] args) {
		try {
			int x = 10/0;
			System.out.println(x);
			
			int y[] = {10,20};
			y[4] = 9;
			System.out.println(y);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("limit se bhar ja raha hai");
		}
		catch(ArithmeticException ae) {
			System.out.println("zero allowed nahii hai");
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
	}

}
