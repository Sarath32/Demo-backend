package Array.interview_questions02;

import java.util.Scanner;

public class Duplicate_Number_07 {

	public static void main(String[] args) {
		
		System.out.print("Enter your array size :");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] s=new int[n];
		System.out.println("Enter your array :");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Your array is : ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("Duplicate value are:");
		
		for(int i=0;i<s.length;i++)
		{
			int count=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					count++;
					s[j]=0;
				}
			}
			
			
			if(count >1 && s[i]!=0)
			{
				System.out.print(s[i]+" ");
			}
		}
		
	}
}
