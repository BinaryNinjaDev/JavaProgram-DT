//FILE INPUT STREAM
import java.io.*;
 class FileDemo2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Animesh.txt");
		int i = 0;
		while((i=fis.read()) != -1) {
			System.out.println((char)i);
		}

	}

}
