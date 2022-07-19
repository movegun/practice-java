class G1 
{
	G1(){
		m1();
		System.out.println("G1()의 끝");
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
		G1 g = new G1();

		System.out.println("main()의 끝");
	}
}
