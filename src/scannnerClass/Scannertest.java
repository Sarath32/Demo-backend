package scannnerClass;

import java.util.Scanner;

public class Scannertest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your RollNo : ");
		int RollNo=sc.nextInt();
		
		System.out.println("Enter your Name : ");
		String Name=sc.next();
		
		System.out.println("Enter your fee :");
		double Fee=sc.nextDouble();
		
		
		
		System.out.println("Name : "+Name+
				           ", RollNo : "+RollNo+
				           ", Fee : "+Fee);
		
		
		
	}

}
