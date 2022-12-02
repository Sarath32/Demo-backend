package processchecking;

import java.util.Scanner;

public class scankthlargest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size :");
		
		int n=sc.nextInt();
		
		int s[]=new int[n];
		
		System.out.println("Enter array values :");
		
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		
		System.out.print("give kth value :");
		Scanner sc1=new Scanner(System.in);
		
		int k=sc1.nextInt();
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]<s[j])
				{
					int t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+"th largest value is "+s[i]);
			}
		}
		
	}

}
