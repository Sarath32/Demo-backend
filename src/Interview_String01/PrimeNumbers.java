package Interview_String01;

public class PrimeNumbers {

	public static void main(String[] args) {
						
	String	primenumbers="";	
		
	for(int i=0; i<=1000;i++)
	{
		int count=0;
		for(int j=i;j>=1;j--)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			primenumbers=primenumbers+i+" ";
		}
	}
		System.out.println(primenumbers);

	}

}
