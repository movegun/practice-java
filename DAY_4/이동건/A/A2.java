class A2 
{
	void m1(){
		byte r = (byte)(127+2);
		System.out.println("r�� " +r);
	}
	void m2(){
		char c = 'B';
		int i = c;
		System.out.println("i�� "+i);
	}
	void m3(){
		System.out.println("Integer.Max_VALUE�� "+Integer.MAX_VALUE );
		System.out.println("Integer.MIN_VALUE�� " + Integer.MIN_VALUE);
	}

	public static void main(String[] args) 
	{
		A2 a = new A2();
		a.m1();
		a.m2();
		a.m3();
	}
}
