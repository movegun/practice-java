class E 
{
	final int i = 1; //���(Constant)
	void m1(){
		System.out.println("i: " + i);

		//i = 2; //����� �ʱⰪ ���� �Ұ�!
		//System.out.println("i: " + i);
	}
	void m2(){
		final int j = 2;
        System.out.println("j: " + j); 
	}
	void m3(){
		//static int k = 3; //����������� static�� ���� �� ����
	}
	public static void main(String[] args) 
	{
		E e = new E();
		e.m1();
		e.m2();
	}
}
