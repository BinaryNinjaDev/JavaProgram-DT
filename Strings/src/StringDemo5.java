//SOLUTION
 class StringDemo5 {
	 String str;
	 StringDemo5(String str){
		 this.str=str;
	 }
	 public String toString() {
		 return str;
	 }
	 public boolean equals(StringDemo5 str) {
		 if(this.str==str.str) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

	public static void main(String[] args) {
		String s1 = new String("Good Morning");
		String s2 = new String("Good Morning");
		if(s1.equals(s2)) {
			System.out.println("both are same");
		}else {
			System.out.println("not same");
		}
		StringDemo5 d1 = new StringDemo5("Good Morning");
		StringDemo5 d2 = new StringDemo5("Good Morning");
		if(d1.equals(d2)) {
			System.out.println("both are same");
		}else {
			System.out.println("not same");
		}

	}

}
