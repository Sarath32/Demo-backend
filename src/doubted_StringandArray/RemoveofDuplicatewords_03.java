package doubted_StringandArray;

import java.util.Arrays;

public class RemoveofDuplicatewords_03 {

	static void removeDuplicate(String s) {
	
	String d[]=s.split(" ");
	
	for(int i=0;i<d.length;i++)
	{
		for(int j=0;j<d.length;j++)
		{
			if(d[i].equals(d[j]))
			{
				if(i != j)
				{
					d[j]="";
				}
			}
		}
		if(d[i]!="")
		{
			System.out.print(d[i]+" ");
		}
	}
	
	}

	 public static void main(String[] args) {
		 String s = "javaTpoint is the best is learning javaTpoint website";  
		 
		removeDuplicate(s);
		 
		 
		 
	}
}
