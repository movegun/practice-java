class C3 
{
	void m1(){
		for(int i=0; i<5; i++){
			if(i>2) break;
			System.out.println("i: " + i);
		}
		System.out.println("���� ����");
	}
	void m2(){
		aa:
		for(int j=0; j<2; j++){
			for(int i=0; i<5; i++){
				if(i>2) break aa;
				System.out.println("j: " + j + ", i: " + i);
			}//1
			System.out.println("����1 ����");
		}//2
		System.out.println("����2 ����");
	}
	public static void main(String[] args) 
	{
		C3 c = new C3();
	//	c.m1();
		c.m2();
	}
}
