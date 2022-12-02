package MultiThreading;

public class Yield extends Thread{
	
	public void run() {
		for(int i=0;i<2;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is in control");
			
		}
	
       
	}
	public static void main(String[] args) {
		
		Yield t= new Yield();
		Yield t1= new Yield();
		t.start();
		t1.start();
		
		for(int i=0;i<2;i++)
		{
			t1.yield();
			System.out.println(Thread.currentThread().getName()+" is in control");
		}
		
		
	}

}
