class E 
{
	final int i = 1; //상수(Constant)
	void m1(){
		System.out.println("i: " + i);

		//i = 2; //상수는 초기값 변경 불가!
		//System.out.println("i: " + i);
	}
	void m2(){
		final int j = 2;
        System.out.println("j: " + j); 
	}
	void m3(){
		//static int k = 3; //멤버변수에만 static이 붙을 수 있음
	}
	public static void main(String[] args) 
	{
		E e = new E();
		e.m1();
		e.m2();
	}
}
