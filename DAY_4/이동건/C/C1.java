class C1 
{
	void m1(){
		float f = 100.1111111f;
		double d = 200.2222222222;
		double r1 = f + d;
		System.out.println("r1:" +r1);
		float r2 = f + (float)d;
		System.out.println("r2: " + r2);
	}
	public static void main(String[] args) 
	{
		C1 c = new C1();
		c.m1();
	}
}
