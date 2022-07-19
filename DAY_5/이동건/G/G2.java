class G2 
{
	G2(){
		m1();
		System.out.println("G2()의 끝");
	}
	void m1(){
		for(int i=0; i<5; i++){
			if(i==2) return;
			System.out.println("i: " + i);
		}
		System.out.println("loop나옴");
	}
	public static void main(String[] args) 
	{
		G2 g = new G2();

		System.out.println("main()의 끝");
	}
}
