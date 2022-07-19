class D3 
{
	Integer iObj;
	int i = 10;

	void m1(){
		//iObj = new Integer(i);
		iObj = i; //AutoBoxing 
        System.out.println("iObj: " + iObj);
	}
	void m2(){
		//int j = iObj.intValue();
		int j = iObj; //UnBoxing 
		System.out.println("j: " + (j+1));
	}
	public static void main(String[] args) 
	{
		D3 d = new D3();
		d.m1();
		d.m2();
	}
}
