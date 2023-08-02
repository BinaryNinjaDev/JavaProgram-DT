import java.util.*;
class StringDemo9 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both r same");
		}
		else {
			System.out.println("not same");
		}
		
		String s3 = "        i am animesh kumar gupta     ";
		String s4 = s3.trim();
		System.out.println(s4);

	}

}
