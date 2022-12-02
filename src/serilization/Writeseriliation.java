package serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import IOstreams.ByteArrayoutstream.outputstream;

public class Writeseriliation {
	public static void main(String[] args) throws Exception {
		
	Seriliation se=new Seriliation("will smith", "will_103", "CBE", 25);
	
	OutputStream is=new FileOutputStream("C:\\Users\\Sugumar\\Documents\\SA\\1.SampleCoreJava\\src\\serilization\\serilization");
	ObjectOutputStream os=new ObjectOutputStream(is);
	os.writeObject(se);
	os.close();
	is.close();
	
	System.out.println("Seriliation Done!..");
	
	}
}
