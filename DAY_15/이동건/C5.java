class Waiter implements Runnable
{
	public void run(){
		while(true){
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println("������ �Ѵ�");
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
			System.out.println("�丮�� �Ѵ�");
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
			System.out.println("����� �Ѵ�");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("������� �");
		new Thread(new Waiter()).cal();

		new Chef().start();
		new 
	}
}
