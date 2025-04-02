package logical;

class Thread1 extends Thread{
	public void run() {
		int a = 5;
		int b =6;
		int result = a+b;
		System.out.println("Thread is running");
		System.out.println("Summation is :" + result);
	}
}

class NewThread implements Runnable {
	String name;
	Thread thread;
	NewThread(String name){
		this.name = name;
		thread = new Thread(this,name);
		System.out.println("A new Thread is created\n");
		thread.start();
	}
	public void run() {
		try {
			for(int j=5; j>0; j--) {
				System.out.println(name + ":" +j);
				Thread.sleep(1000);
			}	
		} catch(InterruptedException e) {
			System.out.println(name + "thread interrupted");	
		}
		System.out.println(name + "thread exiting");
	}
	
}


public class PracThread {
	public static void main(String[] args) {
		Thread1 myThread = new Thread1();
		myThread.start();
		
		NewThread t1 = new NewThread("1st");
		NewThread t2 = new NewThread("2nd");
		NewThread t3 = new NewThread("3rd");
		
		try {
			Thread.sleep(5000);
			System.out.println(myThread.getClass());

		} catch(InterruptedException e) {
			System.out.println("Interruption occures in Main thread");
		}
		System.out.println("We are exiting from main thread");
	}
}
