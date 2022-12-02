package stringquestions;

import java.util.Scanner;

public class Count_of_duplicate_words {

	public static void main(String[] args) {

		System.out.println("Enter your String:");
		Scanner sc=new Scanner(System.in);
		String words=sc.nextLine();
		
		String word[]=words.split(",");
		for(int i=0;i<word.length;i++)
		{
			int count=1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
					word[j]="0";
				}
				
			}
			if(count>1 && word[i]!="0" && word[i]!=" ")
			{
				System.out.println(word[i]);
			}
			
		}
		
		
	}

}
