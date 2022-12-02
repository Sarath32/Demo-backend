package NestedClass.NonStatic;

public class LocalinnerClass {
	
	void method1() {
		
		class Innerclass{
			
			void method2() {
				
				System.out.println("Test from inner Class");
			}
		}
	
		Innerclass i=new Innerclass();
		i.method2();
	}

	public static void main(String[] args) {
		
		LocalinnerClass m=new LocalinnerClass();
		m.method1();
		
	}
	
}
