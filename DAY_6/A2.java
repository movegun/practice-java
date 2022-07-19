class A2 
{
    void m1(){ 
		int i = 5; 
		int an = i/3;
		int rest = i%3;
		System.out.println("¸ò: " + an + ", ³ª¸ÓÁö: " + rest);
         
		double d = 3.0;
		double r = i/d;
		System.out.println("r: " + r);
	}

	void m2(){ 
		int i = 1;
		i--;
		i--;
		System.out.println("i: " + i);
	}

	void m2Q(){ 
	    int i = 0; 
		int j = (++i + 1);
		System.out.println("j: " + j);
		System.out.println("i: " + i);
	}

	void m4(){ 
		int i = 1;
		i %= 2;
		System.out.println("i: " + i);
	}
	void m5(){ 
		int i = 10; 
		int j = 2;    
		int k = i&2; 
		System.out.println("k: " + k);

		i = i>>1; 
		System.out.println("i: " + i);
	}
	void m6(){ 
		int i = 2;
		boolean b = 1!=i;
		System.out.println("b: " + b);
	}
	void m7(){ 
		boolean a = true;
		int i = 2; 
		int j = 1; 
		boolean b1 = a&i>j;
		boolean b2 = false & true;
		boolean b3 = true & false;
		boolean b4 = false & false;
		System.out.println("b1: " + b1 + ", b2: " + b2 + ", b3: " + b3 + ", b4: " + b4 );
	}
	void m7Q(){
		int i = 0;
		if(false & (i++>1)){
		}
		System.out.println("i: "  + i);
	}
	void m8(){ 
		boolean b = true;
		b &= false;
		System.out.println("b: " + b);
	}
	void m9(){ 
		//String str = 1>2? "Â¥Àå":"ÅÁ¼öÀ°";
		//System.out.println("str: " + str);

        String str = ""; 
		if(1>2){
			str = "Â¥Àå";
		}else{
			str = "ÅÁ¼öÀ°";
		}
		System.out.println("str: " + str);
	}
	void m10(){
		String str = new String("±è¹ä");
		Object obj = new Object();
		if(str instanceof Object){
			System.out.println("T");
		}else{
			System.out.println("F");
		}
	}
	public static void main(String[] args) 
	{
		A2 a = new A2();
		//a.m1();
		//a.m2();
		//a.m2Q();
		//a.m4();
		//a.m5();
		//a.m6();
		//a.m7();
		//a.m7();
		//a.m7Q();
		//a.m8();
		//a.m9();
		//a.m10();
	}
}
