class A 
{
	public int m(int j){
		System.out.println("부모");
		return j;
	}
}

class AChild extends A
{
	/*int m (){
		return -1;
	}*/
	public int m(int i){
		System.out.println("자식");
		return -1;
	}
}
class AUser
{
	public static void main(String[] args) 
	{
		A a = new AChild();
		a.m(100);
	}
}