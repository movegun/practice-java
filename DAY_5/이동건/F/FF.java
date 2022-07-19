class FF 
{
	void m1(){
		System.out.println("1");
		m2();
		m3();
		System.out.println("2");
	}
	void m2(){
		System.out.println("3");
		System.out.println("4");
		m3();
		System.out.println("10");
	}
	void m3(){
		System.out.println("5");
		System.out.println("6");
		if(true) return;
		System.out.println("7");
	}
	public static void main(String[] args) 
	{
		FF f = new FF();
		System.out.println("8");
		f.m1();
		System.out.println("9");
	}
}
