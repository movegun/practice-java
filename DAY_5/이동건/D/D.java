class D 
{
	void m1(){
		 for(int i=0; i<5; i++){
			aa: if(i==2) continue;
			System.out.println("i: " + i);	
		}
	}
	void m2(){
			for(int j=0; j<2; j++){
				for(int i=0; i<5; i++){
					if(i==2) return ;
					System.out.println("i: " + i   + "         "+  j);	
				}
				System.out.println("·çÇÁ1 ³ª¿È");
			}
		System.out.println("·çÇÁ2 ³ª¿È");
	}
	public static void main(String[] args) 
	{
		D d = new D();
		//d.m1();
		d.m2();
		System.out.println("³¡³²");
	}
}
