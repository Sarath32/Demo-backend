package Array.problems;

public class promlem06 {

	public static void main(String[] args) {
		
		int a[][]= new int[2][2];
		int b[][]= new int[2][2];
		int c[][]= new int[2][2];
		
		a[0][0]=5;
		a[0][1]=5;
		a[1][0]=10;
		a[1][1]=15;
		b[0][0]=20;
		b[0][1]=25;
		b[1][0]=30;
		b[1][1]=35;
		
	for(int i=0; i<a.length;i++)
	{
		for(int j=0; j<a[i].length; j++)
		{
		 c[i][j]=a[i][j]+b[i][j];
		 System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
	
		
	}

}
