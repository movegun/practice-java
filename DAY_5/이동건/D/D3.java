class D3 
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
		D3 d = new D3();
		d.m1();
		d.m2();
	}
}
