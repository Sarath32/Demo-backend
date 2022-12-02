package processchecking;

import java.util.Scanner;

public class scanmergearray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		
		int n=sc.nextInt();
		
		String[] s=new String[n]; 
		
		System.out.print("Enter values : ");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		
		int n1=sc1.nextInt();
		
		String[] s1=new String[n]; 
		
		System.out.print("Enter values : ");
		for(int i=0;i<n1;i++)
		{
			s1[i]=sc1.next();
		}
		
		String c[]=new String[n+n1];
		int d=0;
		for(int i=0;i<s.length;i++)
		{
			c[d]=s[i];
			d++;
		}
		for(int i=0;i<s1.length;i++)
		{
			c[d]=s1[i];
			d++;
		}
		System.out.println("The merged array is :");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
