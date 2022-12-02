package processchecking;

public class count_of_occurances {

	public static void main(String[] args) {
		
		int[] s= {8,9,5,3,5,6,8,4,7,2,1};
		int f=10;
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
			    if(s[i]+s[j]==f)
			{
				System.out.println(s[i]+","+s[j]);
			}
			}
		}
		
		
		
	}
}
