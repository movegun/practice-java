class E4 
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
	E4 e;
	void m1(){
		System.out.println("b�� "+b );
		System.out.println("s�� "+s );
		System.out.println("c�� "+c );
		System.out.println("i�� "+i );
		System.out.println("lo�� " +lo );
		System.out.println("f�� " + f );
		System.out.println("d�� " +d );
		System.out.println("flag�� " +flag);
		System.out.println("str�� " +str);
		//System.out.println("E�� " +e);
		}
	public static void main(String[] args) 
	{
		E4 e = new E4();
		e.m1();
	}
}
