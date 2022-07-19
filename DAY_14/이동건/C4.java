class C 
{
	void m1(){
		System.out.println("m1()");
	}
}
class Ckid extends C
{
	@Override
	void m1(){
		System.out.println("m1()오버라이딩");
	}
	void m2(){
		System.out.println("m2()");
	}
}
class CUser
{
	public static void main(String[] args) 
	{
		C c = new CKid();
		c.m1();
	}
}
