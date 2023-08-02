/*
 * IO------>Input output-------->file handling
 * 
 * Stream is a buffer to store multiple value at one time
 * 
 * It is a mediator java programming language and file
 * 
 * STREAM------------->
 * 1.Input Stream----- mouse, keyboard
 * 2.Output Stream---------monitor,printer
 * 
 * ---->Java program-------steam-------file
 * ----->STREAM IN TWO PARTS:-
 * 1.Byte stream------- It support ASCII Code
 * 2.Character stream-----It support unicode System
 * 
 * -------->STAND ALONE APPLICATION------Byte stream use karenge
 * -------->DISTRIBUTION APPLICATION------Multiple file read and write-----character stream
 * 
 * --->BYTE STREAM KE FAMILY MEMBERS
 * a.FileoutputStream
 * b.FileInputStream
 * c.ByteArrayOutput Stream
 * d.ByteArrayInput Stream
 * e.BufferedOutput Stream
 * f.BufferedInput Stream
 * g.DataInput stream
 * h.DataOutput stream
 * 
 * 
 * Ek package import karna hoga fileHandling Program me
 * import java.io.*;
 * 
 */
import java.io.*;
class FileDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Animesh.txt");
		String s1 = "java is my wife";
		byte b[] = s1.getBytes();
		
		for(int i = 0; i<b.length; i++) {
			fos.write(b[i]);
		}
	}

}
