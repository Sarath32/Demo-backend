package IOstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStream {

	public static void main(String[] args) {
		
		try {
			FileInputStream ip= new FileInputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\testfile");
		
		int i=0;
		while((i=ip.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		ip.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
