package IOstreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class outputstream {

	public static void main(String[] args) {

		try {
			FileOutputStream s= new FileOutputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\testfile");
		    String a="Welcome to Core java ";
		    String f="We going to complete CoreJava"
		    		+ "And heading to SpringBoot ";
		    byte b[]=a.getBytes();
		    byte b1[]=f.getBytes();
		    
		    
		    s.write(b);
		    s.write(b1);
		    
		    s.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
