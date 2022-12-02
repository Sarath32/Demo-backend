package IOstreams.KeyboardInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromKeyboard {

	public static void main(String[] args) throws Exception {

		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader f= new BufferedReader(r);
		
		System.out.println("Enter your Name : ");
		
		String Name = f.readLine();
		
		System.err.println("Welcome "+Name);
		
		System.out.println("Enter your Phone Number : ");
		
		String Address = f.readLine();
		
		System.out.println("Thank You for your Information "+Name);
	}

}
