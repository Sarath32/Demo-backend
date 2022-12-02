package methods;

public class TypesofMethod {

	public static void main(String[] args) {
		
		
		add(50,51);
		TypesofMethod t= new TypesofMethod();
		t.add(60,60,50);
	}

	public static void add(int a,int b) {
		
		
		int c=a+b;
		
		System.out.println(c);
	}
	
	public void add(int a,int b,int d) {
		
		
		int c=d-a;
	
		System.out.println(c);
		mul();
	}
	
	public static void mul() {
		
		int a= 25;
		int b=30;
		int c=a*b;
		
		System.out.println(c);
		
		TypesofMethod t1 = new TypesofMethod();
		t1.div(20,1);
	}
	
	public void div(int a,int b) {
		
		int c=a/b;
		System.out.println(c);
	}
	
}
