package Array.A;

public class MultipleDimension {

	public static void main(String[] args) {

		int a[][]= new int[3][3];
		
		
		int total=0;
		
		int val=5;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=val;
				val+=5;
			}
		}
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
		{
				if(a[i]==a[j])
				{
				total=total+a[i][j];
				}
			System.out.print(a[i][j] +" ");
		}System.out.println();
		
		}
		System.out.println("The diagonal total is "+total);
	}

}
