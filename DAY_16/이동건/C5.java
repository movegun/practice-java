interface CI
{
	void m();
}
class  C
{
	void use(int i){
		int j = 2;  

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
