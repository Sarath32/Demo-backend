package Interview_String02;

import IOstreams.SequenceInputOutput.inputandoutput;

public class FirstNonRepeated_07 {

	public static void main(String[] args) {
		 
		String a="welcome to java";
		
		char c[]=a.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			boolean b=true;
			
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					b=false;
					
					c[j]=0;
				}
			}
			
			if(b && c[i]!=0 && c[i]!=' ')
			{
				System.out.println(c[i]);
				
			}
		}
	}
}
