package NestedClass.NonStatic;

public class MemmberInnerClass {

	void method1() {
	//	System.out.println("Print from outer Method");
		
	}
	class innerclass{
		void method2() {
		//	System.out.println("Print from inner");
		}
	}
	
	public static void main(String[] args) {
		
		MemmberInnerClass v=new MemmberInnerClass();
		v.method1();
		
		MemmberInnerClass.innerclass z=new MemmberInnerClass(). new innerclass();
		z.method2();
		
	}

}
