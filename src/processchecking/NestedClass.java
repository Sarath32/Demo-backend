package processchecking;

public class NestedClass {
	
	void method() {
		
		System.out.println("print from outer method");
		
	}
	
	class innerclass{
		
		void method1() {
			
			System.out.println("Print from inner method");
		}
		
	}
	
	public static void main(String[] args) {
		
		NestedClass r= new NestedClass();
		r.method();
		NestedClass.innerclass v= new NestedClass().new innerclass();
		v.method1();
		
	}
	
	
	
	
}

	
