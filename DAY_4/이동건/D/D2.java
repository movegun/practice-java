class D2
{
	void m1(){
		byte b = 10;
		short s = 20;
		short r = (short)(b + s);
		System.out.println("r= " +r);	
	}

	public static void main(String[] args) 
	{
		D2 d = new D2();
		d.m1();
	}
}
