class D 
{
	int i = 0;
	static int j = 0;
	
	void m1(){
		i++;
	}
	static void m2(){
		j++;
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.m1();
		D d2 = new D();
		d2.m1();

		System.out.println("d1.i: " + d1.i); //1
		System.out.println("d2.i: " + d2.i); //1

		d1.m2();
		System.out.println("d1.j: " + d1.j); //1
		d2.m2();
		System.out.println("d2.j: " + d2.j); //2
	}
}
