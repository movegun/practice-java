class CC 
{
	int i; //객체이며 소속
	static int j; //클래스이며 소속 , 스태틱이 있으니까 클래스 
}
class CCUser
{
	public static void main(String[] args) 
	{
		CC cc = new CC();
		System.out.println("cc.i: " + cc.i);
		System.out.println("CC.j: " + CC.j);
	}
}
