// we use keyword(this) for current class object
//Solution

public class Chain1 {
	Chain1(){
		this(10);
		System.out.println("Default Constructor");
	}
	Chain1(int x){
		this(10,20);
		System.out.println(x);
	}
	Chain1(int x, int y){
		this(20,20,10);
		System.out.println(x+y);
	}
	Chain1(int x, int y, int z){
		System.out.println(x+y-z);
	}

	public static void main(String[] args) {
	    new Chain1();
	}

}
