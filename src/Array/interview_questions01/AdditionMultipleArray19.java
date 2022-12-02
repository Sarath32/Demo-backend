package Array.interview_questions01;

public class AdditionMultipleArray19 {

	public static void main(String[] args) {
  
		int a[][]= new int[3][3];
		int e[][]= new int[3][3];
		int d[][]= new int[3][3];
		int f=5;
		
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
		System.out.println();

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
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				d[i][j]=a[i][j]+e[i][j];
			}
		}
		System.out.println();
		
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
