package processchecking;

public class PrintAllPermutation {

	public String swap(String str,int i,int j ) {
		
		char c[]=str.toCharArray();
		
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		
		return String.valueOf(c);
		
	}
	
	private void permutation(String str, int l, int r)   
	{   
	if (l == r)   
	System.out.println(str);   
	else  
	{   
	for (int i =l; i <=r; i++)   
	{   
	str = swap(str,l,i);   
	permutation(str, l+1, r);   
	str = swap(str,l,i);   
	}   
	}   
	}
	public static void main(String[] args) {
		
		String str="sar";
		int a=str.length();
		PrintAllPermutation p=new PrintAllPermutation();
		p.permutation(str, 0, a-1);
	}
}
