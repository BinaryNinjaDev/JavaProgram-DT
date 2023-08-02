import java.io.ByteArrayOutputStream;

//ByteArrayOutput Stream
 class ByteOIDemo {
	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		String s1 ="i am animesh kumar gupta";
		byte b[] = s1.getBytes();
		baos.write(b);
		
		baos.writeTo(new FileOutputStream("abc.txt"));
		baos.writeTo(new FileOutputStream("abc.txt1"));
		baos.writeTo(new FileOutputStream("abc.txt2"));
		baos.writeTo(new FileOutputStream("abc.txt3"));
		
		System.out.println(baos.toString());
	}

}
