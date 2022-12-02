package Array;

public class Multidimension {

	public static void main(String[] args) {
	
	String	a[][]= new String [2][3];
	        a[0][0]="Studends";
	        a[0][1]="Marks";
	        a[0][2]="Remarks";
	        a[1][0]="Ram";
	        a[1][1]="56";
	        a[1][2]="Pass";
	      
	        
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
		//		System.out.print(a[i][j]+" ");
			}
	//	System.out.println();
		}
		
		
		//System.out.println(a[2][2]);
		
		
		
		
	}

}
