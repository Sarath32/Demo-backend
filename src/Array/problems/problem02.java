package Array.problems;

public class problem02 {

	public static void main(String[] args) {
		
		int total=0;
		float Percentage;
		
		int a[]=new int[3];
		    a[0]=30;
		    a[1]=40;
		    a[2]=50;
		    
		int n=a.length;
		System.out.println(n);
	
		//To Display Elements from Array
		
		for(int i=0; i<n ; i++)
		{
			System.out.println(a[i]);
		}
		
		//To Find Total
		
		for(int i=0; i<n ; i++)
		{
		    
			total=total+a[i];
			
		}
		System.out.println("The Total Value is "+total);
		
		
		//To Find Percentage
		
	    Percentage=(float)total/n;
	    System.out.println("THE PERCENTAGE VALUE IS "+Percentage);
		
		
	}

}
