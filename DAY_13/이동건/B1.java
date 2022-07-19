class B 
{
	B(){
		System.out.println("B()-1");
	}
	B(int i){
		System.out.println("B()-2");
	}
	B(String str){
		System.out.println("B()-3");
	}
	void m(){
		System.out.println("m()-1");
	}
	int m(int i){
		System.out.println("m()-2");
		return i;
	}
	byte m(byte b){
		System.out.println("m()-3");
		return b;
	}
}
class BChild extends B
{
	void m(String str){ //오버로딩함
		System.out.println("m()-11");
	}
}

/*class BUser
{
	public static void main(String[] args) 
	{
		B b = new B(20);
		byte bt = 10;
		b.m(bt);
	}
}*/