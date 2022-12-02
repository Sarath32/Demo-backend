package Array.A;

public class Multidimensional_Multiplication {

	public static void main(String[] args) {
		
		int a[][]= new int[2][3];
		int b[][]=new int [3][3];
		int c[][]=new int [2][3];
		
		int val=1;
		int val1=5;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=val;
				val+=1;
			}
		}
		
		System.out.println("The A Matrix is :");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
			b[i][j]=val1;
			val1+=5;
			}
			
		}
		System.out.println();
System.out.println("The B Matrix is :");
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		//Multiplication of Two Array
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{              //k<can be No.of column of 1st matrix
				           // or can be No.of.row of 2nd matrix
				for(int k=0;k<b.length;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
				sum=0;
			}
		}
		
		System.out.println();
		System.out.println("The C Matrix is :");
				
				for(int i=0;i<c.length;i++)
				{
					for(int j=0;j<c[i].length;j++)
					{
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
				
		
		
	}

}
