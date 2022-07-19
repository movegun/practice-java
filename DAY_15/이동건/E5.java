class  E extends Thread
{
	int i;
	E(){
		start();
	}
	synchronized void m(){
		i++;
		System.out.println("i : "+i);
	}
	void m(){
		System.out.println("일반로직");
		synchronized(this){
			i++
		}
			System.out.println("i : "+ i);
	}
	public void run(){
		while(true) m();
	}
	public static void main(String[] args) 
	{
		E e = new E();
		while(true) e.m();
	}
}
