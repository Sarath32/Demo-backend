package Array.problems;

public class problem05 {

	public static void main(String[] args) {
		
		int a[]=new int[6];
	    a[0]=55;
	    a[1]=75;
	    a[2]=40;
	    a[3]=12;
	    a[4]=13;
	    a[5]=22;

	int	n=a.length;
		for (int i=0;i<n;i++)
		{
		//System.out.println(a[i]);
		}
		
         for(int i=0;i<n;i++)
			  
		  {              
			  for(int j=i+1;j<n;j++)
			  {

				  
				  
				  if(a[i]>a[j])
				  {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				  }
			  }System.out.println(a[i]);
		  }
	
		



		
		
		
		
		
		
		

	}

}
