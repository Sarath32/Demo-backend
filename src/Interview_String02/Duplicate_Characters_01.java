package Interview_String02;

public class Duplicate_Characters_01 {

	public static void main(String[] args) {

		String s="Welcome to java";
		
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					c[j]=0;
				}
			}
			
			if(count>1 && c[i]!=0 && c[i]!=' ')
			{
				System.out.println(c[i]);
			}
		}
				
	}

}
