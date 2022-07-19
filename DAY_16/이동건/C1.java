interface CI
{
	void m();
}
class  C
{
	void use(int i){ //
		int j = 2;  // i , j final 특성이 없으니까 참조 안됨.

		CI ci = ()->{
			System.out.println("i : " + i);
			System.out.println("j : " + j);
		};
		ci.m();
	}
	public static void main(String[] args) 
	{
		C c = new C();
		c.use(1);
	}
}
