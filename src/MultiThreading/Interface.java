package MultiThreading;

public class Interface implements Runnable {

	public static void main(String[] args) {

		Interface t= new Interface();
		Thread tc=new Thread(t);
		tc.start();
		
		Interface t1= new Interface();
		Thread tc1=new Thread(t1);
		tc1.start();
		
		
	}

	@Override
	public void run() {

		for(int i=1;i<=5;i++)
		{
			System.out.println("The Value of I is "+i+
					           " The name of Thread is + "+Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
