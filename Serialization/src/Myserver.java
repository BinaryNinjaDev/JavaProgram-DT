import java.io.*;
 class Myserver {
	 ObjectInputStream ois;
	 
	 Myserver() throws Exception{
		 ois = new ObjectInputStream(new FileInputStream("beardbaba.txt"));
		 Emp e1 = (Emp)ois.readObject();
		 System.out.println(e1.x);
		 System.out.println(e1.y);
		 System.out.println(e1.a);
		 System.out.println(e1.z);
	 }

	public static void main(String[] args) throws Exception {
		new Myserver();
	}

}
