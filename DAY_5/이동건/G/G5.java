class G5 
{
	G5(){
		m1();
		System.out.println("G5()�� ��");
	}
	void m1(){
		for(int i=0; i<5; i++){
			if(i==2) return;
			System.out.println("i: " + i);
		}
		System.out.println("loop����");
	}
	public static void main(String[] args) 
	{
		G5 g = new G5();

		System.out.println("main()�� ��");
	}
}
