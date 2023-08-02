import java.io.*;
 class Myclient {
	 ObjectOutputStream oos;
	 
	 Myclient() throws Exception{
		 oos = new ObjectOutputStream(new FileOutputStream("beardbaba.txt"));
		 Emp e1 = new Emp(10,20,30,40);
		 oos.writeObject(e1);
	 }

	public static void main(String[] args) throws Exception {
		new Myclient();

	}

}
