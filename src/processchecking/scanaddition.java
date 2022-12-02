package processchecking;

import java.util.Scanner;

public class scanaddition {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A matrix row size :");
		int s=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter A matrix column size :");
		int s1=sc1.nextInt();
		
		int[][] a=new int[s][s1];
		
		System.out.println("Enter values:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Array A matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter D matrix row size :");
		int v=scc.nextInt();
		
		Scanner scc1=new Scanner(System.in);
		System.out.println("Enter D matrix column size :");
		int v1=scc1.nextInt();
		
		int[][] d=new int[v][v1];
		
		System.out.println("Enter values:");
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				d[i][j]=scc.nextInt();
				
			}
		}
		
		System.out.println("Array D matrix:");
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
			System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] p=new int[3][3];
		
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				p[i][j]=a[i][j]+d[i][j];
			}
		}
		
		System.out.println("P Matrix is :");
		
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
	}

}
