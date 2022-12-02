package mock_test;

import java.util.Scanner;

public class cardinal_number {

	public static void main(String[] args) {

		System.out.println("Enter your number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int sum=num+num;
		int product=num*num;
		
		if(sum==product)
		{
			System.out.println(num+" is cardinal number");
			
		}
		else
		{
			System.out.println(num+" is not a cardinal number");
		}
		
		
	}
	
}
