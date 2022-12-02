package IOstreams.SequenceInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class inputandoutput {

	public static void main(String[] args) throws Exception {

		FileInputStream ip= new FileInputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\testfile");
		FileInputStream ip1= new FileInputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\testfile2");
		
		FileOutputStream op= new FileOutputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\SequenceInputOutput\\test4");
		
		
		SequenceInputStream s= new SequenceInputStream(ip, ip1);
		int i=0;
		while((i=s.read())!=-1)
		{
			op.write((byte)i);
		}
		
		s.close();
		op.close();
		ip.close();
		ip1.close();
		
	}

}
