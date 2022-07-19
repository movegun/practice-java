class C5 
{
	void m1(){
		float f = 100.11111111111f;
		double d = 210.2222222222;
		double r1 = f + d;
		System.out.println("r1: " +r1);
		float r2 = f + (float)d;
		System.out.println("r2: " + r2);
	}
	public static void main(String[] args) 
	{
		C5 c = new C5();
		c.m1();
	}
}
