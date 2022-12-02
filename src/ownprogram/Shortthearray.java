package ownprogram;

public class Shortthearray {

	public static void main(String[] args) {
		
		int marks[] = new int[5];
		marks[0]=85;
        marks[1]=100;
		marks[2]=54;
		marks[3]=47;
		marks[4]=46;
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("The Sorting of Array is------");
		
		for(int i=0; i<marks.length ; i++)
		{
			for(int j=i+1; j<marks.length; j++)
			{
				if(marks[i] > marks[j])
				{
					int   t=marks[i];
				marks[i]=marks[j];
					marks[j]=t;
				}
					
			}System.out.println(marks[i]);
		}
	System.out.println("Number of marks below the 80");
		
	int count=0;
	
	for(int i=0; i<marks.length;i++)
		{
			if(marks[i]<80)
				count++;
		}		
			
			 System.out.println(count);
			 
			
		
		
	}

}
