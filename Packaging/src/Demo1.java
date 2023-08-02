/*
 * container like
 * -d .demo1.java
 * java p1.demo1
 * Strictly for notepad
 * 
 * NOTE------>WHEN WE MAKE CUSTOM EXCEPTION THEN WE THROWS
 */
//Package p1;
public class Demo1 {
	public void show() {
		System.out.println("showw from package p1");
	}

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.show();

	}

}
