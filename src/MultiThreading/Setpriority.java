package MultiThreading;

public class Setpriority extends Thread {
	
	public void run() {
		
		System.out.println("priority "+Thread.currentThread().getPriority());
		
		
	}
     public static void main(String[] args) {
		
    	 Setpriority t= new Setpriority();
    	 t.setPriority(MAX_PRIORITY);
    	 t.start();
    	 
    	 Setpriority t1= new Setpriority();
    	 t1.setPriority(MIN_PRIORITY);
    	 t1.start();
	}	

}
