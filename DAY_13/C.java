interface C 
{
	int I = 1;
	//C();//불가
	void m();
	
	//JDK8이상부터 허용 
	static void m2(){
	}
	default void m3(){
	}
}
