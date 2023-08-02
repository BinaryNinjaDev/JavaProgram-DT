//Location se read karo
import java.io.*;
 class FileDemo3 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/Animesh kumar gupta/OneDrive/Desktop/JAVA PRACTICE/Animesh/Animesh.txt");
		int i = 0;
		while((i=fis.read()) != -1) {
			System.out.println((char)i);
		}

	}

}
