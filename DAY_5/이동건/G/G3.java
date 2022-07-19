class G3 
{
	G3(){
		m1();
		System.out.println("G3()의 끝");
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
		G3 g = new G3();

		System.out.println("main()의 끝");
	}
}
