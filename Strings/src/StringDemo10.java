import java.util.*;
 class StringDemo10 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		int x = s1.indexOf('l');
		System.out.println(x);
		
		int x2 = s1.indexOf('l',3);
		System.out.println(x2);
		
		String s2 = "I am animesh kumar  kumar gupta";
		int x3 = s2.indexOf("kumar");
		System.out.println(x3);
		
		int x4 = s2.indexOf("kumar",1);
		System.out.println(x4);

	}

}
