package MultiThreading;

public class isInterrupted extends Thread {
	
	public void run() {
		
	for(int i=1;i<3;i++)
	{
		System.out.println(i);
	}
		
	}
	
	public static void main(String[] args) {
		isInterrupted t= new isInterrupted();
		isInterrupted t1= new isInterrupted();
		t.start();
		t1.start();
		System.out.println(t.isInterrupted());
		System.out.println(t1.isInterrupted());
		
		t.interrupt();
		System.out.println(t.isInterrupted());
		System.out.println(t1.isInterrupted());
		
		
		
		
	}

}
