package Deserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserilization {

	public static void main(String[] args) throws Exception {
		 
		FileInputStream is=new FileInputStream("C:\\Users\\Sugumar\\Documents\\SA\\1.SampleCoreJava\\src\\serilization\\serilization");
		ObjectInputStream os= new ObjectInputStream(is);
		os.readObject();
		os.close();
		is.close();
		
		
		
	}

}
