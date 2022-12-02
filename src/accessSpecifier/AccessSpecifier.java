package accessSpecifier;

public class AccessSpecifier {

	public static void main(String[] args) {
		privateclass();
		protectedclass();
		defaultclass();
	}

	public static void publicclass() {
		
	    System.out.println("From public class");	
				
	}
	
    private static void privateclass() {
    	System.out.println("From private class");
    }
	
	protected static void protectedclass() {
		System.out.println("From protected class");
	}
	
	static void defaultclass() {
		System.out.println("From default class");
	}
	
	
	
	
}
