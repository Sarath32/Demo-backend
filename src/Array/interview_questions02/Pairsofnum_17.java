package Array.interview_questions02;

public class Pairsofnum_17 {

	public static void main(String[] args) {
		
		int a[]= {5,2,6,5,6,3,2,1,9};
		
		int s=10;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
					if (j != i && a[i] + a[j] == s) {
			            System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
}
