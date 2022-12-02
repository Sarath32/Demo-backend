package scannnerClass;

import java.util.Scanner;

public class Delimiter {

	public static void main(String[] args) {

		String i = "10 tea 20 coffee 30 tea buiscuits";
		
		Scanner sc= new Scanner(i).useDelimiter(" ");
		
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		
		
		
	}

}
