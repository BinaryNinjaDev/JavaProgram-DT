// Constructor overloading name is same,parameter is changed

//problem-

public class Chain {
	Chain(){
		System.out.println("Default constructor");
	}
	Chain(int x){
		System.out.println(x);
	}
	Chain(int x, int y){
		System.out.println(x+y);
	}
	Chain(int x, int y, int z){
		System.out.println(x+y-z);
	}

	public static void main(String[] args) {
          new Chain();
          new Chain(10);
          new Chain(10,20);
          new Chain(20,20,10);
	}

}
