package processchecking;

public class ToprintDuplicateinString {

	public static void main(String[] args) {
		
		String s="full Stack Java Developer";
		
		
		for(int i=0; i<s.length(); i++)
		{
			char c[]=s.toCharArray();
			for(int j=i+1; j<s.length();j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[i]);
					//System.exit(0);
				}
			}
		}
		
		

	}

}
