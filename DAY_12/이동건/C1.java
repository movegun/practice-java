class C 
{
	String name;
	C(String name){
		this.name = name;
	}
	void move(){
		System.out.println("°È´Â´Ù");
	}
}
class CKid extends C 
{
	String name;
	CKid(){
		super("È«±æµ¿"); //(1) 
	}
	void show(){
		System.out.println("name(1): " + name);
		System.out.println("name(2): " + super.name); //(2) 
	}
	void move(){
		System.out.println("³­´Ù");
	}
	void before(){
		super.move(); //(3) 
	}
}

class CUser
{
	public static void main(String[] args) 
	{
		CKid k = new CKid();
		k.show();
		k.before();
	}
}