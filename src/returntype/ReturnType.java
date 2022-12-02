package returntype;

import accessSpecifier.AccessSpecifier;

public class ReturnType {

	public static void main(String[] args) {

		AccessSpecifier t= add();
		t.publicclass();

	}

	public static AccessSpecifier add() {
		
		int a=20, b=30, c=a+b;
		
		System.out.println(c);
		
		return new AccessSpecifier();
	}
	

}
