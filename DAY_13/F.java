class F implements Inter3
{
	public void m1(){
		System.out.println("m1()");
	}
	public void m2(){
		System.out.println("m2()");
	}
	public void m3(){
		System.out.println("m3()");
	}
}  
class FUser 
{
	public static void main(String[] args) 
	{
		F f = new F();

		Inter1 it1 = f;
		it1.m1();
		Inter2 it2 = f;
		it2.m2();
		System.out.println();

		Inter3 it3 = f;
		it3.m1();it3.m2();it3.m3();
		
		//it3.I = 8;//ºÒ°¡!
		System.out.println("Inter3.I: " + Inter3.I);
	}
}