class F2 
{
	void m1(){
		boolean b = 1<2; //false
		if(b)
			System.out.println("맞는 식이다");
	}
	int i;
	void m2(){
		i=-3;
		if(i<0){
			System.out.println("음수이다");
		}else if(i>0){
			System.out.println("양수이다");
		}else{
			System.out.println("0이다");
		}
	}
	public static void main(String[] args) 
	{
		F2 f = new F2();
		//f.m1();
		f.m2();
	}
}
