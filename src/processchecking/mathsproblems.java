package processchecking;

public class mathsproblems {

	public static void main(String[] args) {

		String div="";
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				div=div+i+" ";
			}
		}
		
		System.out.println(div);
		
	}

}
