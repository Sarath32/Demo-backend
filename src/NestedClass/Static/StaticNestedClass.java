package NestedClass.Static;


public class StaticNestedClass {

	static class InnerClass{
		
		 void testmethod() {
			
			 System.out.println("Print from innerclass");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		StaticNestedClass.InnerClass c= new StaticNestedClass.InnerClass();
				
		      c.testmethod();
				
		
	}

}
