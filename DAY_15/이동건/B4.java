class B implements Runnable
{
	B(){
		Thread th = new Thread(this);
		th.start();
	}
	void m(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println("B - ¿œ - 1");
		}
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e ){}
			System.out.println("B - ¿œ - 2");
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.m();
	}
}
