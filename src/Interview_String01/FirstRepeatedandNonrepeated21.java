package Interview_String01;

import java.util.Arrays;

public class FirstRepeatedandNonrepeated21 {

	public static void main(String[] args) {
		
		
		String s="ava Developer";
		
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
			if(b && c[i]!=0 && c[i]!=' ' )
			{
				System.out.println("The Non First Repeated Char is "+c[i]);
				System.exit(0);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
