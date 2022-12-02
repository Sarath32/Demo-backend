package processchecking;

import java.util.Scanner;

public class scanonlydigit {

	public static boolean onlydigit(String a) {
		
		char c[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(c[i]>='a' && c[i]<'z' || c[i]>='A' && c[i]<'Z')
			{
				return false;
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the sentence");
		Scanner sc=new Scanner(System.in);
		String d=sc.next();
		
		System.out.println("The Sentence contain only digits --> "+onlydigit(d));
	}
}
