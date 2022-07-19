class C 
{
	C(){
		try{
			System.out.println("1");
			use1();
			System.out.println("2");
			use2();
			System.out.println("3");
		}catch(YourException ye){
			System.out.println("(1):"+ye);
			ye.handleY();
		}catch(MyException me){
			System.out.println("(2):"+me);
			me.handleM();
		}catch(Exception e){
			System.out.println("(3):"+e);
		}
	}
	
	C() throws YourException, MyException{
		use1();
		System.out.println("발생안함");
		try{
			use2();
		}catch(Exception e){
			System.out.println("C() e:"+e);
		}
	}

	int i=0;
	void use1() throws MyException, YourException{
		if (i<0){
			throw new MyException();
		}else if (i>0){
			throw new YourException();
		}
	}

	boolean flag = true;
	void use2() throws Exception{
		if(flag) throw new Exception();
	}
	

	public static void main(String[] args) 	{
		try{
			new C();
		}catch(Exception e){
			System.out.println("main() e:"+e);
		}
	}
}
