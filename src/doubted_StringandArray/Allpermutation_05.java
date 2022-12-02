package doubted_StringandArray;

public class Allpermutation_05 {

	public String swapChar(String str, int i, int j)   
	{     
	char temp;   
	char[] chArray = str.toCharArray();   
	temp = chArray[i] ;   
	chArray[i] = chArray[j];   
	chArray[j] = temp;   
	return String.valueOf(chArray);   
	} 
	    
	private void permutation(String str, int l, int r)   
	{   
	if (l == r)   
	System.out.println(str);   
	else  
	{   
	for (int i =l; i <=r; i++)   
	{   
	str = swapChar(str,l,i);   
	permutation(str, l+1, r);   
	str = swapChar(str,l,i);   
	}   
	}   
	}
	
	public static void main(String args[])   
	{   
	String str = "come";   
	int length = str.length();   
	Allpermutation_05 per= new Allpermutation_05();  
	per.permutation(str, 0, length-1);   
	} 
	  
	}  


