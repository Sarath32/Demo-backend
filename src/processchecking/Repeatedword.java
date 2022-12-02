package processchecking;

public class Repeatedword {

	public static void main(String[] args) {
		
		String s="50,56,23,48,50,123,50,65,56";
		
		String a[]=s.split(",");
		
		for(int i=0; i<a.length;i++)
		{
			boolean b=true;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equalsIgnoreCase(a[j]))
				{
					b=false;
					a[j]="0";
				}
			}
			if(b && a[i]!="0" && a[i]!=" ")
			{
				System.out.print(a[i]+" ");
				//System.exit(0);
			}
		}
		
		

	}

}
