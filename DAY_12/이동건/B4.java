class B 
{
	String str;
	B(){
	//	str = "Â¥Àå¸é";
		this("Â¥Àå¸é"); //(2)
	}
	B(String str){
		this.str = str; //(1)
		BUser user = new BUser(this); //(3)
		user.use(); 
	}
	void m(){
		System.out.println("m()");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		B b2 = new B("Â«»Í");
	}
}
class BUser
{	
	B b;
	BUser(B b){
		this.b = b;
	}
	void use(){
		System.out.println("str: " + b.str);	
		b.m();
	}
}
