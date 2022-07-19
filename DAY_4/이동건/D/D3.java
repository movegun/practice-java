class D3
{
	void m1(){
		byte b = 10;
		short s = 20;
		short r = (short)(b + s);
		System.out.println("r= " +r);	
	}
	public static void main(String[] args) 
	{
		D3 d = new D3();
		d.m1();
	}
}
