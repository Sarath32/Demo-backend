package processchecking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class all {

	public static void main(String[] args) {
		
		String a="java,react,c,c++";
		
		String c[]=a.split(",");
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length-i-1;j++)
			{
				if(c[j].compareTo(c[j+1])>0)
				{
					String t=c[j];
					c[j]=c[j+1];
					c[j+1]=t;
				}				
			}
		}
		
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

		
	}
}
