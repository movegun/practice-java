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
			System.out.println("���ܹ߻�����");
		}catch(MyException me){
			System.out.println(me+"�߻���");
		}
	}
}
