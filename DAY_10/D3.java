class D 
{
	void m(){
		try{
			System.out.println("1");
			use();
			System.out.println("2");
		}catch(MyException me){
			System.out.println("3");
		}catch(YourException ye){
			System.out.println("4");
		}finally{
			System.out.println("5");
		}
		System.out.println("6");
	}

	void use() throws MyException, YourException{
		boolean b = false;
		if(b){
			throw new MyException();
		}else {
			throw new YourException();
		}
	}

	public static void main(String[] args) 
	{
		D d = new D();
		d.m();
		System.out.println("7");
	}
}
