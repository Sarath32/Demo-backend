package IOstreams.CharArrayWriter;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharArrayWrites {

	public static void main(String[] args) throws Exception  {

		CharArrayWriter c =new CharArrayWriter();
		c.write("Next mission is Spring Boot");
		
		FileWriter f= new FileWriter("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\CharArrayWriter\\file1");
		FileWriter f1= new FileWriter("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\CharArrayWriter\\file2");
		FileWriter f2= new FileWriter("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\CharArrayWriter\\file3");
		
		c.writeTo(f);
		c.writeTo(f1);
		c.writeTo(f2);
		
		f.close();
		f1.close();
		f2.close();
		c.close();
		
		
	}

}
