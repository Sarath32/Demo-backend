package Interview_String02;

public class Stringsort_20 {

	public static void main(String[] args) {
		
		String s="java,c++,c,phyton,react";
		
		String a[]=s.split(",");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			System.out.print(a[i]+" ");
		}
		
	}
}
