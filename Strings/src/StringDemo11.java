 class StringDemo11 {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		int x = s1.lastIndexOf('l');
		System.out.println(x);
		
		int x1 = s1.lastIndexOf('l',3);
		System.out.println(x1);
		
		String s2 = "I am animesh kumar kumar gupta";
		int x3 = s2.lastIndexOf("kumar");
		System.out.println(x3);
		
		int x4 = s2.lastIndexOf("kumar",11);
		System.out.println(x4);

	}

}
