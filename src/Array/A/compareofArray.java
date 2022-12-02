package Array.A;

import java.util.Arrays;

public class compareofArray {

	public static void main(String[] args) {

		String a[]={"java","sort"};
		String b[]= {"sort","java"};
		
		if(a.length==b.length)
		{
			Arrays.sort(a);
			Arrays.sort(b);
			
			boolean result=Arrays.equals(a,b);
			
			if(result)
			{
				System.out.println("They are equal");
			}
			else
			{
				System.out.println("They are not equal");
			}
			
		}
		else
		{
			System.out.println("They are not equal");
		}
	}

}
