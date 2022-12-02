package IOstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputandOutput {

	public static void main(String[] args) {

		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\testfile");
            
			FileOutputStream op = new FileOutputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\testfile2");
			
			int i=0;
			while((i=ip.read())!=-1)
			{
				op.write((byte)i);
			}
		
		     ip.close();
		     op.close();
		
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
