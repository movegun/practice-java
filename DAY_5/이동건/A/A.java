class A
{
	void m1(){
		for (int i=2;i<10 ;i++ ){
			for (int j=1;j<10 ;j++ ){
				System.out.println("");
				for (int z=1;z<10;z++ ){
					System.out.println( i+" x "+j+" x "+z+" = "+i*j*z);
				}
			}
		}
}

void m2(){
	int i=1;
	while (i<10){
		int j=1;
		while (j<10){
			int z=1;
			while (z<10){
				System.out.println(i+" x "+j+" x "+z+" = "+i*j*z);
				z++;
			}
			j++;
		}
		i++;
	}
}

void m3(){
	int X =0;
	int Y =0;
	for (int i=1; i<101 ; i++ ){
		if (i%2==0){
			X = X+i;
			}
		else {
			Y = Y+i;
			}
		}
		System.out.println("Â¦¼öÀÇ ÇÕ"+X);
		System.out.println("È¦¼öÀÇ ÇÕ"+Y);
		System.out.println("¸ðµç ¼öÀÇ ÇÕ"+ (X+Y));
}

////Â¦¼ö ³¢¸® ÇÕ
////È¦¼ö ³¢¸® ÇÕ
	public static void main(String[] args) 
{
	A a = new A();
	//a.m1();
	//a.m2();
	a.m3();
}
}