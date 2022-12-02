package IOstreams.SequenceInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class InputStream {

	public static void main(String[] args) throws Exception {

		FileInputStream ip= new FileInputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\ByteArrayoutstream\\test1");
		FileInputStream ip1= new FileInputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\testfile");
		
		SequenceInputStream s= new SequenceInputStream(ip, ip1);
		int i =0;
		while((i=s.read())!=-1)
		{
			
			System.out.print((char)i);
			
			
		}
		s.close();
		ip.close();
		ip1.close();
		
	}

}
