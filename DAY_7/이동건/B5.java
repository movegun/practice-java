class B5 
{
	void m1(){
		int is[] = new int[3];
		is[0] = 10;
		is[1] = 20;
		is[2] = 30;

		for(int i=0; i<is.length; i++){ 
			System.out.println("is["+i+"]: " + is[i]);
		}
	}
	void m2(){

		String strs[] = new String[4]; 
		strs[0]="봄";strs[1]="여름";strs[2]="가을";strs[3]="겨울"; //
		
		for(int i=0; i<strs.length; i++){ 
			System.out.println("strs["+i+"]: " + strs[i]);
		}
	}
	public static void main(String[] args) 
	{
		B5 b = new B5();
		b.m1();
		b.m2();
	}
}
