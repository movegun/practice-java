class Fth1 extends Thread
{
	public void run(){
		F.m();
	}
}
class Fth2 extends Thread
{
	public void run(){
		F.m();
	}
}

class F
{
	static int i;
	F(){
		Thread th1 = new Fth1();
		Thread th2 = new Fth2();
		th1.start();
		th2.start();
		try{
			th1.join();
			th2.join();
		}catch(InterruptedException ie){}
		System.out.println(" i :" + i );
	}
	synchronized static void m(){
		for (int j=0; j<10000 ; j++ ){
			i++;
		}
	}

	public static void main(String[] args) 
	{
		new F();
	}
}
