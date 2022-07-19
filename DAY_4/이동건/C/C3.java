class C3 
{
	void m1(){
		float f = 1010.11111111111f;
		double d = 2110.2222222222;
		double r1 = f + d;
		System.out.println("r1: " +r1);
		float r2 = f + (float)d;
		System.out.println("r2: " + r2);
	}
	public static void main(String[] args) 
	{
		C3 c = new C3();
		c.m1();
	}
}
