class A1
{
	void m1(){
		byte r = (byte)(127+1);
		System.out.println("r: " + r);
	}
	void m2(){
		char c = 'A';
		int i = c;
		System.out.println("i: " + i);
	}
	void m3(){
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
	}
	
	public static void main(String[] args) 
	{
		A1 a = new A1();
		a.m1();
		a.m2();
		a.m3();
	}
}
