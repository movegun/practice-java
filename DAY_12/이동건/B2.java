class B 
{
	String str;
	B(){
	//	str = "¥���";
		this("¥���"); //(2)
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
		B b2 = new B("«��");
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
