package Interview_String02;

public class FirstReapeated_21 {

	public static void main(String[] args) {
		
		String s="java,c++,react,c,c++,react,c++";
		String a[]=s.split(",");
		for(int i=0;i<a.length;i++)
		{
			boolean result=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equalsIgnoreCase(a[j]))
				{
					result=false;
					a[j]="0";
				}
			}
			
			if(result && a[i]!="0" && a[i]!=" ")
			{
				System.out.print(a[i]+" ");
				
			}
			System.exit(0);
		
				
		}
	}
}
