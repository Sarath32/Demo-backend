package Array.A;

public class JaggedAray {
public static void main(String[] args) {
	
	int marks[][]=new int[3][];
	int val=1;
	marks[0]=new int[3];
	marks[1]=new int[4];
	marks[2]=new int[6];
	
	for(int i=0;i<marks.length;i++)
	{
		for(int j=0; j<marks[i].length;j++)
		{
			marks[i][j]=val;
			val+=1;
		}
		
	}
	for(int i=0;i<marks.length;i++)
	{
		for(int j=0; j<marks[i].length;j++)
		{
			System.out.print(marks[i][j]+" ");
		}
		System.out.println();
	}	}
	
	
	
}

