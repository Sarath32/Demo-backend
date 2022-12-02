package processchecking;

public class duplicate_remove_words {

	public static void main(String[] args) {
		
	   String a="welcome to java and welcome to cbe";
	   
	   String c[]=a.split(" ");
	   
	   for(int i=0;i<c.length;i++)
	   {
		   for(int j=i+1;j<c.length;j++)
		   {
			   if(c[i].equals(c[j]))
			   {
				   c[j]="";
			   }
		   }
		   if(c[i]!="")
		   {
			   System.out.print(c[i]+" ");
		   }
	   }
		
		
	}
}
