class AOut 
{
	String str = "¶ó¸é";
	void m(){
		System.out.println("m()");
	}

	class Ain1{
		int i;
		void m1(){
			System.out.println("m1()");
		}
		void use(){
			System.out.println("str : "+ str);
			m();
		}
	}

	static class AIn2{
		static int j;
		static void m2(){
			System.out.println("m2()");
		}
		int k;
		void m3(){
			System.out.println("m3()");
		}
	}

}


class A
{	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}