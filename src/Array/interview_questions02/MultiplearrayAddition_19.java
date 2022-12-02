package Array.interview_questions02;

public class MultiplearrayAddition_19 {

	
	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		int d[][]=new int[3][3];
		
		int s=5;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s;
				s+=5;
			}
		}
		System.out.println("A matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=s;
				s+=5;
			}
		}
		System.out.println("C matrix:");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			int mul=0;
			for(int j=0;j<c[i].length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					d[i][j]=d[i][j]+a[i][k]*c[k][j];
				}
				
			}
		}
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
