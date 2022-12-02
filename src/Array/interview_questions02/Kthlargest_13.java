package Array.interview_questions02;

import java.util.Scanner;

public class Kthlargest_13 {
public static void main(String[] args) {
		
		int s[]= {80,63,47,90,19};
		System.out.print("Enter which largest number is required :");
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]<s[j])
				{
					int  t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
			
			if(i==k-1)
			{
				System.out.println(k+"th largest is "+s[i]);
			}
		}
	}
}


