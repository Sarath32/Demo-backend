package Array.interview_questions02;

import java.util.Scanner;

public class Reverse_Array_01 {

	public static void main(String[] args) {
		
		System.out.print("Enter your array size :");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("your array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reversed array:");

		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
