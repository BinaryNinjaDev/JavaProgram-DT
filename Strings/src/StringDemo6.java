//ARRAY TO STRING OBJECT PASS
//charAt----->ka kam ha ek ek karke print karwana
class StringDemo6 {

	public static void main(String[] args) {
		char ch[] = {'h','e','l','l','o'};
		String s1 = new String(ch);
		System.out.println(s1);
		
		String s2 = new String(ch,0,2);
		System.out.println(s2);
		
		byte b[] = {65,66,67,68,69};
		String s3 = new String(b);
		System.out.println(s3);
		
		String s4 = new String(b,0,3);
		System.out.println(s4);

	}

}
