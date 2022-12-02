package MultiThreading;

public class  Multitreadig extends Thread {
	
	public void run() {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("The value of I is "+i+"The Thread name is "+Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		
		Multitreadig t= new Multitreadig();
		t.start();
		Multitreadig t1=new Multitreadig();
		t1.start();

	}

}
