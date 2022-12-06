package mock_test;

import java.util.Scanner;

public class cardinalnumber {

	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int add=num+num;
		int mul=num*num;
		
		if(add==mul)
		{
			System.out.println(num + " is cardinal");
		}
		else {
			System.out.println(num + " is not cardinal");
		}
		
	}
}
