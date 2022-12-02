package doubted_StringandArray;

import javax.swing.border.EmptyBorder;

public class RemoveDuplicateChar_03 {

	static void removeDuplicate(String s) {
		
		char d[]=s.toCharArray();
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
				if(d[i]==d[j])
				{
					if(i != j)
					{
						d[j]=' ';
					}
				}
			}
			if(d[i]!=' ')
			{
				System.out.print(d[i]+" ");
			}
		}
		
		}

		 public static void main(String[] args) {
			 String s = "welcome to java";  
			 
			removeDuplicate(s);
			 
			 
			 
		}
}
