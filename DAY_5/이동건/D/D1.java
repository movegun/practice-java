class D1 
{
	void m1(){
		for(int i=0; i<5; i++){
			if(i==2) continue;
			System.out.println("i: " + i);	
		}
	}
	void m2(){
		aa:	for(int j=0; j<2; j++){
			for(int i=0; i<5; i++){
				if(i==2) break;
				System.out.println("i: " + i);	
			}
			System.out.println("����1 ����");
		}
		System.out.println("����2 ����");
	}
	public static void main(String[] args) 
	{
		D1 d = new D1();
		//d.m1();
		d.m2();
	}
}
