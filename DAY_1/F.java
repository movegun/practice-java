class F 
{
	public static void main(String[] args) 
	{
		System.out.println("<나의 가족 구성원>");
		
		new F().m1();
	}
	void m1(){System.out.println("1. 아빠"); m2();}

	void m2(){System.out.println("2. 엄마"); m3();}

	void m3(){System.out.println("3. 형"); m4();}

	void m4(){System.out.println("4. 나");}

}
