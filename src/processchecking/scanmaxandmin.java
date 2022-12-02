package processchecking;

import java.util.Scanner;

public class scanmaxandmin {

		public static void main(String[] args) {

			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array size");
			int s=sc.nextInt();
			
			int a[]=new int[s]; 
			
			for(int i=0;i<s;i++)
			{
				
			   System.out.println("Enter your array : ");
				
			    a[i]=sc.nextInt();
			}	
			System.out.println("The Array is : ");
			for(int i=0;i<a.length;i++)
			{
			System.out.print (a[i]+" ");
			}
		
			int max=a[0];
			int min=a[0];
			
			for(int i=0;i<a.length;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
				
				if(min>a[i])
				{
					min=a[i];
				}
			}
			System.out.println();
			
			System.out.println("The maximum in the array is "+max);
			System.out.println("The Minmum in the array is "+min);
			
}
}