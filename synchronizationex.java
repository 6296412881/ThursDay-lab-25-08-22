package Assignment;

 
	//shared object
	 class PrintData{
	 
	  synchronized void multiplication(int n) //method not synchronized
	 	{
	 	System.out.println("Outside of synchronizede block");
	 		//synchronized (this) {
	 			
	 	for(int i=1;i<=5;i++)
	 		{
	 			System.out.println(n*i);
	 			
	 			try {
	 				Thread.sleep(400);
	 			}catch(Exception e) {
	 				System.out.println(e);
	 			}
	 		}
	 	}
	 }
	 class Thread1 extends Thread
	{
		PrintData t;
		public Thread1(PrintData t) {
			this.t=t;
	}
	public void run() {
		t.multiplication(5);
	}
		}
	class Thread2 extends Thread
	{
	PrintData t;
	public Thread2(PrintData t) {
		this.t=t;
	}
	public void run() {
		t.multiplication(100);
		}
		}
	public class synchronizationex {
		public static void main(String[] args) {
			
	    PrintData pd=new PrintData();
			
		Thread1 t1=new Thread1(pd);
		Thread2 t2=new Thread2(pd);
		t1.start();
		t2.start();
			

	}
	}
	
	 
	
	
	
	 
