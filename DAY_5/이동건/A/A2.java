class A2
{
	void m1(){
		for(int i=0; i<5; i++){
			System.out.println("i: " + i);
		}
	}
	void m2(){ 
		for(int i=1; i<10; i++){
			System.out.println("2 x "+i+" =  "+ 2*i);
		}	
	}
	void m3(){ 
		for(int j=2; j<10; j++){
			for(int i=1; i<10; i++){
				System.out.println(j +" x "+i+" =  "+ j*i);
			}
		}
	}
	void m4(){ 
		for(int k=2; k<=9; k++){
			for(int j=1; j<=9; j++){
				for(int i=1; i<=9; i++){
					System.out.println(k+" x "+j+" x "+i+" =  "+ k*j*i);
				}
			}
		}
	}
	void m5(){ 
		int k=2; 
		while(k<=9){
			int j=1; 
			while(j<=9){
				int i=1;
				while(i<=9){
					System.out.println(k+" x "+j+" x "+i+" =  "+ k*j*i);
					i++;
				}
				j++;
			}
			k++;
		}
	}
	public static void main(String[] args) 
	{
		A2 a = new A2();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
	}
}