class F 
{
	void m1(){
		System.out.println("1");
		m2();
		System.out.println("2");
	}
	void m2(){
		System.out.println("3");
		if (true) return ;
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
		F f = new F();
		System.out.println("5");
		f.m1();
		System.out.println("6");
	}
}
