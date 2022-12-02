package MultiThreading;

public class Setname extends Thread {

	public void run() {
		
		System.out.println("Thread running....");
		
	}
	
	
	
	public static void main(String[] args) {

		Setname r = new Setname();
		r.setName("First Thread");
		System.out.println("The name of the first thread is "+r.getName());
		
		Setname r1 = new Setname();
		r1.setName("Second Thread");
		System.out.println("The name of the Second thread is "+r1.getName());

		r.start();
		r1.start();

	}

}
