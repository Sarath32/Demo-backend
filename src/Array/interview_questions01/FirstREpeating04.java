package Array.interview_questions01;

public class FirstREpeating04 {

	public static void main(String[] args) {
		
		String a[]= {"Cersi","Snow","Arya","Robb","Arya","Robb"};
		
		int count;
		for(int i=0; i<a.length; i++)
		{
			count=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]="0";
					
				}
			}
			if(count>1 && a[i]!="0")
			{
				System.out.println(a[i]);
				System.exit(0);
			}
					}

	}

}
