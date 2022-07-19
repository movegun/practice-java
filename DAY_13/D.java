interface D 
{
	int I=1;
	void m1();
	default void m2(){
		System.out.println("m2()");
	}
	static void m3(){
		System.out.println("m3()");
	}
}
class DChild implements D
{
	public void m1(){
		System.out.println("m1()");
	}
	/*public void m2(){ //public이어야 함
		System.out.println("m2()-2");
	}
	static void m3(){ //public이 아니어도 상관없음
		System.out.println("m3()-3");
	}*/
}

class DUser
{
	public static void main(String[] args) 
	{
		D d = new DChild();
		System.out.println("d.I: " + d.I);
		d.m1();
		d.m2();
		//d.m3(); //불가!
		D.m3();
	}
}
