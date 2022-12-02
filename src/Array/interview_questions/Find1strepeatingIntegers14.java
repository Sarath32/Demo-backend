package Array.interview_questions;

public class Find1strepeatingIntegers14 {

	public static void main(String[] args) {
		
		int a[]= {10,50,2,50,48,10,56,50};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("The first repeated value is "+a[i]);
					System.exit(0);
				}
			}
		}
		
		
	}
	
}
