package IOstreams.JavaReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reading {

	public static void main(String[] args) throws Exception {

		FileReader d= new FileReader("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\testfile");
		 
		int i=0;
		while((i=d.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		d.close();
		
		
		
	}

}
