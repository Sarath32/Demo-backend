package MultiThreading;

public class Suspend extends Thread {

	public void run() {
		
		
			for(int i=0;i<3;i++)
			{
				System.out.println(Thread.currentThread().getName());
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			}
	}
	
	public static void main(String[] args) {
		
		Suspend t= new Suspend();
		Suspend t1= new Suspend();
		Suspend t2= new Suspend();
		
		
		t.start();
		t1.start();	
		t2.stop();
		
		
		
	}
	
	
}
