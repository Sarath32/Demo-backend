package IOstreams;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		System.out.println("Enter your PassWord to proceed next step");
		
		Scanner s= new Scanner(System.in);
		String  a= s.next();
		
		System.err.println("Welcome to Next Page");
		
		System.out.println("Enter your name :");
		
		String name=s.next();
		
		System.out.println("WElcome "+name);
	}

}
