class A extends Thread
{
	A(){
		start();
	}
	void m(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println("��-1");
		}
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println("��-2");
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m();
	}
}
