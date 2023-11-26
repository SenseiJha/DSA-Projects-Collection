package Threading;

public class ThreadDemo {

	public static void main(String[] args)throws Exception {
		
		Thread t1=new Thread(()-> {
			for(int i=1;i<=5;i++) {
				System.out.println("Hi "+Thread.currentThread().getPriority()); 
				try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
			}
		},"Hi Thread");//Naming The Thread
		
		Thread t2=new Thread(()-> {
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
			}
		},"Hello Thread");//Naming The Thread
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {e.printStackTrace();}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Bye");
		System.out.println(t1.isAlive());
	}
}