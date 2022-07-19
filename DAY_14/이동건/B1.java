class  B1{
	class B2{
		class B3{
		}
	}
	interface B4
	{
	}
	static interface B5
	{
	}
}
interface B6
{
	int I=0;			//인터B6의 멤버 상수
	void m1();   //abstract
	
	interface B7
	{
		int J=1;
		void m2();
	}
	static interface B8
	{
	}
	class B9
	{
	}
	static class B10
	{
	}
}
class B6Child implements B6
{
	public void m1(){
		System.out.println("m1() 구현");
	}
}
class B7Child implements B6.B7
{
	public void m2(){
		System.out.println("m2() 구현");
	}
}
 
class B
{
	public static void main(String[] args) 
	{
		B6 b6 = new B6child();
		System.out.println("b6.I :"+b6.I);
		b6.m1();

		B6.B7 b7 = new B7child();
		System.out.println("b7.J :"+ b7.J);
		b7.m2();
	}
}