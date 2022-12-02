package IOstreams.JavaReader;

import java.io.FileWriter;
import java.io.IOException;

public class writing {
	public static void main(String[] args) throws Exception {

	FileWriter fw=new FileWriter("C:\\Users\\Sugumar\\Documents\\SA\\sampleproject\\src\\IOstreams\\JavaReader\\file1");
	
	fw.write("Welcome to trio tend");
	
	fw.close();
	}
	
}
