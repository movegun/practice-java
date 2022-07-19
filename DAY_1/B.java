class B 
{
	public static void main(String[] args)
	{
		System.out.println("이게 보일까?");
		
		new B().m1();
	}
	void m1(){
		System.out.println("이건 두번째 라인?");
		System.out.println("이건 세번째 라인");
		System.out.println("이건 네번째 라인");
	}
}