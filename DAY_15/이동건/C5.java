class Waiter implements Runnable
{
	public void run(){
		while(true){
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println("서빙을 한다");
		}
	}
}
class Chef extends Thread
{
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println("요리를 한다");
		}
	}
}
class Boss
{
	public void cal(){
		while(true){
			try{
				Thread.sleep(3000);
			}catch(Exception e){}
			System.out.println("계산을 한다");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("레스토랑 운영");
		new Thread(new Waiter()).cal();

		new Chef().start();
		new 
	}
}
