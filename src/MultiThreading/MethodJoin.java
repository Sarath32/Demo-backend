package MultiThreading;

public class MethodJoin extends Thread{
	
	
	public void run() {
		
		for(int i=1;i<=4;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}
	public static void main(String[] args) {
		
		MethodJoin t1= new MethodJoin();
		MethodJoin t= new MethodJoin();
		MethodJoin t2= new MethodJoin();
		t1.start();

		
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    t.start();
	    t2.start();
		 
	}

}
