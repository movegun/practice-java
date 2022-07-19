class B 
{
	int price = 1;

	void m(int P){
		price = P;
	}
	public static void main(String[] args) 
	{
		B b = new B();
		System.out.println("i1: " + b.price);
		b.m(2);
		System.out.println("i2: " + b.price);
	}
}
