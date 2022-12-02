package MultiThreading;

public class Daemon extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread Work");
		}
		else
		{
			System.out.println("User Thread work");
		}
	}
	
	
	
	public static void main(String[] args) {
		Daemon t= new Daemon();
		Daemon t1= new Daemon();
		Daemon t2= new Daemon();
	    t.setDaemon(true);
	    t2.setDaemon(true);
	    t.start();
	    t1.start();
	    t2.start();
		
	}

}
