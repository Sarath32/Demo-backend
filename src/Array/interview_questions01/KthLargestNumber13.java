package Array.interview_questions01;

public class KthLargestNumber13 {

	public static void main(String[] args) {

		int s[]= {82,56,154,8,32,151,3265,3166,213,6545,485};
		int k=6;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]<s[j])
				{
					int t=s[i];
					s[i]=s[j];
					s[j]=t;
					
				}
			}
			if(i==k-1)
			{
				System.out.println(k+"th of largest number in the array is "+s[i]);
			}
		}
		
		
	}

}
