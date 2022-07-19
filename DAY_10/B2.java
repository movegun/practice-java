class B 
{
	boolean flag = true;
	
	void m1() throws MyException{
		if(flag){
			throw new MyException();
		}
	}

	public static void main(String[] args) 
	{
		B b = new B();
		try{
			b.m1();
			System.out.println("예외발생안함");
		}catch(MyException me){
			System.out.println(me+"발생함");
		}
	}
}
