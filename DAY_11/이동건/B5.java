class B {
	private int i = 20;
	private B(){
		System.out.println("B()");
	}
	private void m(){
		int j = 30;
		System.out.println("m()");
	}
}
/*class BUser
{
	public static void main(String[] args) 
	{
		B b = new B(); //b:������, ����, ����, X
		System.out.println(b.i);
		b.m();
	}
}*/
