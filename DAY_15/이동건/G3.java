class Gth1 extends Thread
{
	G g ;
	Gth1(G g){
		this.g = g;
	}
	public void run(){
		g.m();
	}
}
class Gth2 extends Thread
{
	G g ;
	void setG(G g){
		this.g = g ;
	}
	public void run(){
		g.m();
	}
}
class G
{
	int k;
	G(){
		Thread th1 = new Gth1(this);
		Gth2 th2 = new Gth2();
		th2.setG(this);
		th1.start();
		th2.start();
		try{
			th1.join();
			th2.join();
		}catch(InterruptedException ie){}
		System.out.println("k : " + k );
	}

	synchronized void m(){
		for (int j=0; j<10000 ; j++ ){
			k++;
		}
	}
	void m(){
		System.out.println("일반로직");
		synchronized(this){
			for (int j=0; j<10000 ; j++ ){
				k++;
			}
		}
	}

	public static void main(String[] args) 
	{
		new G();
	}
}
