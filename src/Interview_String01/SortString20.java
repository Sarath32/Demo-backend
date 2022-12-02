package Interview_String01;

public class SortString20 {

	public static void main(String[] args) {
		
		String s="java,c++,c,phyton";
		
		String a[]=s.split(",");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
	}

}
