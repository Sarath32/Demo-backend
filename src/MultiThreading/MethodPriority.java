package MultiThreading;

public class MethodPriority extends Thread {

	public void run() {
		
		System.out.println("Current thread name "+Thread.currentThread().getName());
         
	}
	
	public static void main(String[] args) {

		MethodPriority t= new MethodPriority();
		
		MethodPriority t1= new MethodPriority();
		System.out.println("t1 thread priority : " + t1.getPriority());
		System.out.println("t thread priority : " +t.getPriority());
		
		t.start();
		t1.start();
		
		
		
	}

}
