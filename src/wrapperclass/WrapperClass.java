package wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {

		int i=60;
		byte b=8;
		short s=4546;
		long l=389461356L;
		float f=563.23F;
		double d=56131.2589;
		char c='d';
		boolean v=true;
		
		
		//Autoboxing
		
		Integer i1=i;
		Byte b1=b;
		Short s1=s;
		Long l1=l;
		Float f1=f;
		Double d1=d;
		Character C1=c;
		Boolean v1=v;
		
		System.out.println(i1);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(C1);
		System.out.println(v1);
		
		
		// AutoUnboxing
		
		int i2=i1;
		byte b2=b1;
		short s2=s1;
		long l2=l1;
		float f2=f1;
		double d2=d1;
		char c2=C1;
		boolean v2=v1;
		System.out.println();
		System.out.println(i2);
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(c2);
		System.out.println(v2);
		
		
		
		
	}

}
