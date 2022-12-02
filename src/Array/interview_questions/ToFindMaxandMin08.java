package Array.interview_questions;

public class ToFindMaxandMin08 {

	public static void main(String[] args) {
		
		int num[]= {100,563,500,80,35,40};
		int max=num[0];
		int min =num[0];
		for(int i=0; i<num.length; i++)
		{
				if(num[i]>max)
				{
					max=num[i];
				}
				if(num[i]<min)
				{
					min=num[i];
				}
		}
		System.out.println("The Max Value in the Array is "+max);
		System.out.println("The Min Value in the Array is "+min);

	}

}
