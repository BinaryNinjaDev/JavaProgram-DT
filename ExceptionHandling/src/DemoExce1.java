/*
 * Exception-----> Abnormal Condition
 * Error------> Mistake
 * Try
 * Catch
 * Finally
 * Throws
 * Throw
 */
class DemoExce1 {

	public static void main(String[] args) {
		try {
			int x = 10/0;
			System.out.println(x);
		}
		catch(ArithmeticException ae) {
			System.out.println("Zero allowed nahii hai");
		}

	}

}
