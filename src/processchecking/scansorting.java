package processchecking;

import java.util.Scanner;

public class scansorting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of the Array : ");
		
		int s=sc.nextInt();
		String a[]=new String[s];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value of Array : ");
			
			a[i]=sc.next();
		}
		System.out.print("The Array values are ");

		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("The Accending order of the array is :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
							a[i]=a[j];
							a[j]=temp;
				}
			}
			
			System.out.print(a[i]+",");
		}
		
		System.out.println();
		System.out.println("The Decending order of the array is :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])<0)
				{
					String temp=a[i];
							a[i]=a[j];
							a[j]=temp;
				}
			}
			
			System.out.print(a[i]+",");
		}
	}
}
