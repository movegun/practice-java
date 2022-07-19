class Th1 extends Thread 
{
	public void run(){
		while(true){
			System.out.println("th1-m");
		}
	}
}
class Th2 extends Thread{
	public void run(){
		while(true){
			System.out.println("th2-m");
			yield();
		}
	}
}
class D
{
	D(){
		Th1 th1 = new Th1();
		th1.start();

		Th2 th2 = new Th2();
		th2.setPriority(Thread.Max_PRIORITY);
		th2.start();
	}
	void showP(){
		System.out.println("Thread.MAX_PRIORIRY : " + Thread.MAX_PRIORIRY);
		System.out.println("Thread.MIN_PRIORIRY : " + Thread.MIN_PRIORIRY);
		System.out.println("Thread.NORM_PRIORIRY : " + Thread.NORM_PRIORIRY);
	}


	public static void main(String[] args) 
	{
		D d = new D();
	}
}
