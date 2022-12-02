package Array.interview_questions02;

public class maxandmin_08 {

	public static void main(String[] args) {
		
		int a[]= {80,90,63,23,45,15};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
