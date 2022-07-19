class F3 
{
	void m1(){
		System.out.println("m1()-1");
		m2();
		System.out.println("m1()-1");
	}
	void m2(){
		System.out.println("m2()-1");
		if(true) return;
		System.out.println("m2()-2");
	}
	public static void main(String[] args) 
	{
		F3 f = new F3();
		System.out.println("main()-1");
		f.m2();
		System.out.println("main()-2");
	}
}