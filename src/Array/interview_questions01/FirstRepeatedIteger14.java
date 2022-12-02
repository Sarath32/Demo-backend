package Array.interview_questions01;

public class FirstRepeatedIteger14 {

	public static void main(String[] args) {

		int a[]= {90,63,59,63,90,36,52,36};
		int count;
		for(int i=0;i<a.length;i++)
		{
			 count=1;
			boolean b=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b=false;
					a[j]=0;
				}
			}//first non repeated
			if(b && a[i]!=0)
			{
				System.out.println(a[i]);
				System.exit(0);
			}
		}
		
		
		
		
	}

}
