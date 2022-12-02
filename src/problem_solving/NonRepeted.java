package problem_solving;

public class NonRepeted {

	public static void main(String[] args) {
		
		String s="java";
		
		char c[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			boolean b=true; 
		
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j])
				{
					
					b=false;
					c[j]=0;
				}
			}
			if(b && c[i]!=0)
			{
				System.out.println(c[i]);
			}
		}
		
		
	}

}
