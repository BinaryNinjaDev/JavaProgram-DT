import java.io.*;
 class DataOIDemo {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("abc5.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		dos.write(10);
		dos.writeFloat(10.5f);
		dos.writeBoolean(true);
		
		DataInputStream dis = new DataInputStream(new FileInputStream("abc5.txt"));
		int x = dis.readInt();
		float f = dis.readFloat();
		boolean b = dis.readBoolean();
		
		System.out.println(x);
		System.out.println(f);
		System.out.println(b);
	}

}
