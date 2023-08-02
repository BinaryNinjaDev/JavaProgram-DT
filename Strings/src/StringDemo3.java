 class StringDemo3 {
	 String str;
	 StringDemo3(String str){
		 this.str=str;
	 }
	 public String toString() {
		 return str;
	 }

	public static void main(String[] args) {
		String s1="Hello";
		System.out.println(s1.length());
		System.out.println(s1);
		
		String s3 ="Hello";
		if(s1==s3) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("not same");
		}
		
		String s2 = new String("Hello");
		System.out.println(s2.length());
		System.out.println(s2);
		
		String s4 = new String("Hello");
		if(s2==s4) {
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		
		StringDemo3 d1 = new StringDemo3("Animesh kumar gupta");
		System.out.println(d1);

	}

}
