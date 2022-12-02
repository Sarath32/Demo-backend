package Array.interview_questions02;

public class MergeoftwoArrays_02 {

	public static void main(String[] args) {
		
		String arr1[]= {"Welcome to"};
		String arr2[]= {"core java"};
		
		String arr3[]=new String[arr1.length+arr2.length];
		
		int d=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[d]=arr1[i];
			d++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[d]=arr2[i];
			d++;
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
}
