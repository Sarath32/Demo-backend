package MultiThreading;

public class MethodCurrentthread extends Thread {

	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
	
	
	public static void main(String[] args) {

		MethodCurrentthread t= new MethodCurrentthread();
		t.start();
		MethodCurrentthread t1= new MethodCurrentthread();
        t1.start();
		
	}

}
