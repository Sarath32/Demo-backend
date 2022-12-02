package Array.interview_questions02;

import java.util.Scanner;

public class MergeofArrays_02_02 {

	public static void main(String[] args) {
		
		System.out.println("Enter your  1st array size:");
		
		Scanner sc=new Scanner(System.in);
		
		int q=sc.nextInt();
		
		int [] a=new int[q];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
       System.out.println("Enter your  2nd array size:");
		
		Scanner sc1=new Scanner(System.in);
		
		int w=sc1.nextInt();
		
		int[] d= new int[w];
		for(int i=0;i<d.length;i++)
		{
			d[i]=sc1.nextInt();
		}
		
		int [] c=new int[q+w];
		
		int s=0;
		
		for(int i=0;i<a.length;i++)
		{
			c[s]=a[i];
			s++;
		}
		for(int i=0;i<d.length;i++)
		{
			c[s]=d[i];
			s++;
		}
		System.out.println("Your combained array:");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
