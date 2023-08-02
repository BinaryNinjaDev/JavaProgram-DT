import java.io.*;
 class FileDemo1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Users/Animesh kumar gupta/OneDrive/Desktop/JAVA PRACTICE/Animesh/Animesh.txt",true);
		String s1 = "java is my life and aslo wife";
		byte b[] = s1.getBytes();
		
		for(int i = 0; i<b.length; i++) {
			fos.write(b[i]);
		}
	}

}
