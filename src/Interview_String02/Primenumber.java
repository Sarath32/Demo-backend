package Interview_String02;

public class Primenumber {

	public static void main(String[] args) {
		

		String pm="";
		
		for(int i=0;i<100;i++)
		{
			int c=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				pm=pm+i+" ";
			}
		}
		System.out.println(pm);
	}
}
