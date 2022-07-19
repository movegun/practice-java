class C1 
{
	void m1(){
		int is[] = {10, 20, 30}; 

		for(int i=0; i<is.length; i++){ 
			System.out.println("is["+i+"]: " + is[i]);
		}
	}
	void m2(){
		String strs[] = {"봄", "여름", "가을", "겨울"}; 
		
		for(int i=0; i<strs.length; i++){ 
			System.out.println("strs["+i+"]: " + strs[i]);
		}
	}
	public static void main(String[] args) 
	{
		C1 c = new C1();
		c.m1();
		c.m2();
	}
}