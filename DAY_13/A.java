class A 
{
	private int m(int j){
		System.out.println("A - m()");
		return j;
	}
}
class AChild extends A
{
	/*int m(){ //Çã¿ëX
		return -1;
	}*/
	private int m(int i){
		System.out.println("AChild - m()");
		return i;
	}
}


/*class AUser
{
	public static void main(String[] args) 
	{
		A a = new AChild();
		a.m(10);
	}
}*/
