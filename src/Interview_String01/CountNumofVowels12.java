package Interview_String01;

public class CountNumofVowels12 {

	public static void main(String[] args) {

		String a="Java PrOgramer";
		a=a.toLowerCase();
		char s[]=a.toCharArray();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<a.length();i++)
		{
			if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
			{
				vcount++;
			}
			else if(s[i]>='a' && s[i]<='z')
			{
				ccount++;
			}
					
		}
		System.out.println(ccount);
		System.out.println(vcount);
	}

}
