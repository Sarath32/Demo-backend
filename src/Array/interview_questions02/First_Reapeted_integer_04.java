package Array.interview_questions02;

public class First_Reapeted_integer_04 {

	public static void main(String[] args) {
		
		int a[]= {80,65,23,65,96,45,65,23};
		
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					a[j]=0;
				}
			}
			if(c>1 && a[i]!=0)
			{
				System.out.print(a[i] +" ");
				System.exit(0);
			}
			
		}
		
		
	}
}
