package Array.A;

public class Transpose {

	public static void main(String[] args) {
		
		int num[][]= new int[3][3];
		
		int val=5;
		
		for(int i=0; i<num.length;i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				num[i][j]=val;
				val+=5;
			}
		}
		System.out.println("The Matrix Before Transpose : ");
		
		for(int i=0; i<num.length;i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				System.out.print(num[i][j]+" ");
			}
		System.out.println();
		}
		
		int tr[][]=new int[num.length][num[0].length];
		
		for(int i=0; i<num.length;i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				tr[i][j]=num[j][i];
			}
		}
		System.out.println();
		System.out.println("The Matrix After Transpose :");
		for(int i=0; i<num.length;i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				System.out.print(tr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
