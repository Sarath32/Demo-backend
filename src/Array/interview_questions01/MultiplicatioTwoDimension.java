package Array.interview_questions01;

public class MultiplicatioTwoDimension {

	public static void main(String[] args) {

		int a[][]= new int[3][3];
		int e[][]= new int[3][3];
		int d[][]= new int[3][3];
		int f=5;
		
		System.out.println("Matrix A is:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=f;
				f+=5;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
System.out.println("Matrix E is:");
		
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<e[i].length;j++)
			{
				e[i][j]=f;
				f+=1;
			}
		}
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<e[i].length;j++)
			{
				System.out.print(e[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{                   //i here denotes the column length i=0,1,2
			for(int j=0;j<e[i].length;j++)
			{               //k should be length of column of 1st matrix
				            //or length of row of 2nd matrix
				for(int k=0;k<a[i].length;k++)
				{
					sum=sum+a[i][k]*e[k][j];
				}
				d[i][j]=sum;
				sum=0;
			}
			
		}
		System.out.println();
		System.out.println("Matrix D is:");

		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
