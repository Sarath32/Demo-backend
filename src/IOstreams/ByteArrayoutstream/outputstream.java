package IOstreams.ByteArrayoutstream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class outputstream {

	public static void main(String[] args) {
       
		try {
			FileOutputStream op= new FileOutputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\ByteArrayoutstream\\test1");
			FileOutputStream op1= new FileOutputStream("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\ByteArrayoutstream\\test2");

			ByteArrayOutputStream b=new ByteArrayOutputStream();
			b.write(139);
			
			b.writeTo(op);
			b.writeTo(op1);
		
		
		    b.close();
		    op.close();
		    op1.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
		
		
	}

}
