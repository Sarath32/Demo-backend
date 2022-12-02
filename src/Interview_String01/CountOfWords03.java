package Interview_String01;

public class CountOfWords03 {

	public static void main(String[] args) {
		
		String s="Welcome to trio tend";
		
		String a[]=s.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println(count);
		

	}

}
