package operators;

public class Logical_Operators {

	public static void main(String[] args) {
		
		byte a=25;
		byte b=20;
		byte c=50;
		byte d=20;
		
		//and
		System.out.println(a>b && b<=d);
		
		//OR
		System.out.println(a<b || d<c);
		
		//Not Operator
		System.out.println(!(a<b || d<c));
		
	}

}
