interface Inter1{
	void m1();
}
interface Inter2{
	void m2();
}
interface Inter3 extends Inter1, Inter2
{
	public final static int I = 7;
	void m3();
}

class E implements Inter1, Inter2 //다중상속 
{
	public void m1(){
		System.out.println("m1()");
	}
	public void m2(){
		System.out.println("m2()");
	}
}  
class EUser 
{
	public static void main(String[] args) 
	{
		E e = new E();

		Inter1 it1 = e;
		it1.m1();
		Inter2 it2 = e;
		it2.m2();
	}
}


