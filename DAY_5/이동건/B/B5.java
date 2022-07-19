class B5
{
	void m1(){
		int i=0;
		for(; i<5; i++)
			System.out.println("i: " + i);
	}
	void m2(){   
		for(int i=1; i<=9; i++){
			if(i%2==0)
			System.out.println("2 x "+ i +" =  "+ 2*i);
		}	
	}
	void m3(){ // 
		int sum = 0;
		for(int i=1; i<=100; i++){
			sum += i;
		}
		System.out.println("sum: " + sum);
	}
	void m4(){ 
		int X = 0;
		int Y = 0; 
		for(int i=0; i<=100; i++){
			if(i%2==0) Y += i;
			else X += i;
		}

		System.out.println(
		"Â¦¼öÇÕ: " + Y + ", È¦¼öÇÕ: " + X + ", ÀüÃ¼ÇÕ: " + (Y+X));
	}
	public static void main(String[] args) 
	{
		B5 b = new B5();
		//b.m1();
		//b.m2();
	//	b.m3();
		b.m4();jab
	}
}
