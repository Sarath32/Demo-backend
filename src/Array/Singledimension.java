package Array;

public class Singledimension {

	public static void main(String[] args) {
		
		
		//arrays used to store the multiple value in the single variable under single data type
		
	//	int a[]= {50,90,20,56};
		
		int a[]=new int [4];
		    a[0]=50;
            a[1]=90;
            a[2]=20;
            a[3]=56;
            
         //   System.out.println(a[3]);
            
        int b[]=a.clone();   
        
        for (int i=0; i<4; i++)
        {
      	System.out.println(b[i]);
        }
       
        
        //To Sort arrays in ascending order
        
        
        for(int i=0; i<b.length; i++)
        {
        	for(int j=i+1; j<b.length; j++)
        	{
        		if(b[i]>b[j])
        		{
        			int t=b[i];
        			b[i]=b[j];
        			b[j]=t;
        			
      		}   
        	}//System.out.println(b[i]);
        }
         
        
        
        // To Combine both arrays in new array   
       
        int n=a.length+b.length;
        
        int c[]= new int[n];
        
        for(int i=0;i<a.length;i++)
        {
        	c[i]=a[i];
        //	System.out.println(c[i]);
        	
        }
        int j=0;
        for(int i=b.length; i<c.length; i++)
        {
        	c[i]=b[j];
        	j++;
        	
        }
        for(int i=0; i<c.length; i++)
        {
        	System.out.println(c[i]);
        }
      
	}

}
