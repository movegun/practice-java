abstract class F 
{
	int i;
	//abstract F(); //생성자는 오버라이딩 개념이 없으므로
	abstract void m1();
	void m2(){
		System.out.println("m2()");
	}
}
class FChild extends F
{
	void m1(){ //오버라이딩 
		System.out.println("m1()");
	}
}

class FUser
{
	public static void main(String args[]){
		//F 객체를 만들고 사용하시오 : 쉬는 시간 갖고.. 도전!! 
		F f = new FChild();
		System.out.println("f.i: " + f.i);
		f.m1();
		f.m2();
	}
}
