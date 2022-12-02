package processchecking;

public class Toprintduplicates {

	public static void main(String[] args) {

       String s= "GokulPrasath";
       
       char c[]= s.toCharArray();
       
       for(int i=0; i<s.length();i++)
       {
    	 
    	   for(int j=i+1; j<s.length();j++)
    	   {
    		   if(c[i]==c[j])
    		   {
    			   System.out.println("The Duplicates Characters are --- >"+c[i]);
    		   }
    	   }
       }
		
		
		
		
	}

}
