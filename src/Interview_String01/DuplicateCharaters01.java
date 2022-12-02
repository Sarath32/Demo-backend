package Interview_String01;

import java.util.Scanner;

public class DuplicateCharaters01 {
public static void main(String[] args) {
	
	System.out.println("enter :");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
			
	char c[]=s.toCharArray();
	int count;
	for(int i=0;i<c.length;i++)
	{
		count=1;
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
