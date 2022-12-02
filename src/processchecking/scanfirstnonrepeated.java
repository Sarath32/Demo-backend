package processchecking;

import java.util.Scanner;

public class scanfirstnonrepeated {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String c[]=s.split(" ");
		
		
		for(int i=0;i<c.length;i++)
		{
		     boolean b=true;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i].equalsIgnoreCase(c[j]))
				{
					b=false;
					c[j]="0";
				}
			}
			if(b && c[i]!="0")
			{
				System.out.println(c[i]);
				System.exit(0);
			}
		}
		
		
		
		
		
	}
	
}
