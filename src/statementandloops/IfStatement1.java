package statementandloops;

public class IfStatement1 {

	public static void main(String[] args) {
	
		int a=50;
		int b=20;
		int c=30;
 //1.      
 if(a>b)
 {
        System.out.println("1.A is greater than B");
 }
 
 //2.
 if(c==b)
 {
         System.out.println("2.C is equal to B");
 }
 else {
	 System.out.println("2.C and B are different");
 }
        	 
 //3.
 if (a<c) {
	 System.out.println("3.A is smaller than C");
 }
 else if (a<b)
 {
	 System.out.println("3.A is smaller than B");
	 
 }
 else
 {
	 System.out.println("3.A is greater than all");
 }
 
//4.Nested If
 
 if(a>b)
 {
	 if(a>c)
	 {
		 System.out.println("4.A is the greatest");
	 }
 }
		
		
		
	}

}
