class H5
{
	void m1(){
		System.out.println("m1�̴�");
		int i = 0;
		while (i<5){
			System.out.println("i�� �� =" +i);
			i=i+1;
		}
			}
	void m2(){
		System.out.println("m2()");
		int i =0;
		do{
			System.out.println("i�� �� = "+i);
			i= i+1;
		}while(i<0);
		System.out.println("������ ���Դ�"+i);
	}
	void m3(){
		System.out.println("m3()");
		for (int i=0;i<5 ;i=i+1 )
		{
			System.out.println("i : "+i);
		}
	}
	public static void main(String[] args) 
	{
	H5 h = new H5();
	h.m1();
	h.m2();
	h.m3();
	}
}
