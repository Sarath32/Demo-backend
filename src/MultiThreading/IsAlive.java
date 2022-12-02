package MultiThreading;

public class IsAlive extends Thread{

	public void run() {
	try {
		System.out.println("is run() method is alive "+Thread.currentThread().isAlive());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		
		IsAlive t= new IsAlive();
		
		System.out.println("The Thread is alive before starting "+t.isAlive());
		t.start();
		System.out.println("The Thread is alive after startig "+t.isAlive());
		
		
		
		
	}
}
