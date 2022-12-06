package Array.interview_questions01;

public class AdditionSingleArray18 {

	public static void main(String[] args) {

		int a[]= {80,90,56,48,23,12};
		int m[]= {12,56,48,16,98,41,68};
		int s=a.length>m.length?a.length:m.length;
		int small=a.length<m.length?a.length:m.length;
		int v[]=new int[s];
		for(int i=0;i<small;i++)
		{
			v[i]=a[i]+m[i];
		}
		for(int i=small;i<s;i++)
		{
			if(a.length>m.length)
			{
			v[i]=a[i];
			}
			else if(a.length<m.length)
			{
				v[i]=m[i];
			}
		}
		for(int i=0;i<s;i++)
		{
			System.out.println(v[i]);
		}
		
	}

}
