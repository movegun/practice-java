class D1
{
	void m1(){
		byte b = 10;
		short s = 20;
		short r = (short)(b + s);
		System.out.println("r¿∫ " +r);	
	}

	public static void main(String[] args) 
	{
		D1 d = new D1();
		d.m1();
	}
}
