class C 
{
	void m1(){
		System.out.println("m1()");
	}
}
class CKid extends C
{
	@Overrid
	void m1(){
		System.out.println("m1()¿À¹ö");
	}
	void m2(){
		System.out.println("m2()");
	}
}
		
class CUser
{
	public static void main(String[] args) 
	{
		C c = new Ckid();
		c.m1();
	}
}
