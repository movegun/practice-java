class G4 
{
	G4(){
		m1();
		System.out.println("G4()의 끝");
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
		G4 g = new G4();

		System.out.println("main()의 끝");
	}
}
