package stringquestions;

public class Count_of_words {

	public static void main(String[] args) {

		String a="Welcome to trio tend & coimbatore";
		
		String s[]=a.split(" ");
		
		int count=0;
		
		for(int i=0;i<s.length;i++)
		{
			count++;
		}
		
		System.out.println("Number of words in the String is : "+count);
		
	}

}
