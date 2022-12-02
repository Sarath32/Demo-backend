package Interview_String01;

public class FirstNonRepeatedChar07 {

	public static void main(String[] args) {
		
		String words="full Stack Developer";
		char a[]=words.toCharArray();
		
		for(int i=0;i<words.length();i++)
		{
			boolean b=true;
			
			for(int j=i+1;j<words.length();j++)
			{
				if(a[i]==a[j])
				{
					b=false;
					a[j]=0;
					
				}
			}
			if(b && a[i]!=0 && a[i]!=' ')
			{
				System.out.println(a[i]);
				System.exit(0);			
			}
		}
		
		
		

	}

	

}
