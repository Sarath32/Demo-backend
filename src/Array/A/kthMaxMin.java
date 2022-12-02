package Array.A;

public class kthMaxMin {

	public static void main(String[] args) {
  
	int a[]= {50,63,58,12,39,2,78,40};
	
	int k=3;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		if(i==k-1)
		{
			System.out.println(i+"th min value is "+a[i]);
		}
	}
	
	
	
	
	
	}

}
