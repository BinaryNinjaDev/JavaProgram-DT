//ERROR----->CANNOT ASSIGN A VALUE TO A FINAL VARIABLE X

interface Gy {
	int x = 10;
}
class Child7 implements Gy{

	public static void main(String[] args) {
		System.out.println(x);
		x = x+10;

	}

}
