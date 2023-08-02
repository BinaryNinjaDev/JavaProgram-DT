//PROBLEM
//NOTE------>>Object class equals check reference id
 class StringDemo4 {
	 String str;
	 StringDemo4(String str){
		 this.str=str;
	 }
	 public String toString() {
		 return str;
	 }

	public static void main(String[] args) {
		String s1 = new String("Good Morning");
		String s2 = new String("Good Morning");
		if(s1.equals(s2)) {
			System.out.println("both are same");
		}else {
			System.out.println("not same");
		}
		
		StringDemo4 d1 = new  StringDemo4("Good Morning");
		StringDemo4 d2 = new StringDemo4("Good Morning");
		
		if(d1.equals(d2)) {
			System.out.println("both are same");
		}else {
			System.out.println("not same");
		}
		

	}

}
