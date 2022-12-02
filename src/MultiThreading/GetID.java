package MultiThreading;

public class GetID extends Thread{
	
	public void run() {
		
		System.out.println("Thread");
	}
	
	public static void main(String[] args) {
		
		GetID t= new GetID();
		System.out.println("The Name of the Thread is "+t.getName());
		System.out.println("The ID of the Thread is "+t.getId());
		t.start();
	}
	
	
	

}
