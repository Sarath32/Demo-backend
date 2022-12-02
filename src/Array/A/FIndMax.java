package Array.A;

public class FIndMax {
public static void main(String[] args) {
	
	int a[]= {50,74,12,63,59,46};
	
	int max =a[0];
	int min =a[0];
	
	for(int i=0; i<a.length;i++)
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
