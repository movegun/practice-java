class F 
{
	public static void main(String[] args) 
	{
		System.out.println("<���� ���� ������>");
		
		new F().m1();
	}
	void m1(){System.out.println("1. �ƺ�"); m2();}

	void m2(){System.out.println("2. ����"); m3();}

	void m3(){System.out.println("3. ��"); m4();}

	void m4(){System.out.println("4. ��");}

}
