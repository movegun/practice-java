class E3 
{
	byte b;
	short s;
	char c;
	int i;
	long lo;
	float f;
	double d;
	boolean flag;
	String str;
	E3 e;
	void m1(){
		System.out.println("b는 "+b );
		System.out.println("s는 "+s );
		System.out.println("c는 "+c );
		System.out.println("i는 "+i );
		System.out.println("lo는 " +lo );
		System.out.println("f는 " + f );
		System.out.println("d는 " +d );
		System.out.println("flag는 " +flag);
		System.out.println("str은 " +str);
		//System.out.println("E는 " +e);
		}
	public static void main(String[] args) 
	{
		E3 e = new E3();
		e.m1();
	}
}
