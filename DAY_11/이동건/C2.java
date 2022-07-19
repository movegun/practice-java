class C 
{
	static int i = 10;
	int j = 20;
	C(){
		System.out.println("C()");
	}
	static void m1(){
		System.out.println("m1()");

		C c = new C();
		c.m2();
		System.out.println("j: " + c.j);
	}
	void m2(){
		System.out.println("m2()");
	}
}
class CUser
{
	public static void main(String[] args) 
	{
		System.out.println("i: " + C.i);
		C.m1();
	}
}
