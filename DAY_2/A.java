class A {
	String name = "이동건"; //멤버변수 클래스 다음 바로 나올 수 있다.
	A(){ //생성자 클래스랑 이름이 똑같다
		System.out.println("A()");
	}
	void m(){ // 메소드 클래스 앞에 나올수 있는 3개
		System.out.println("m()");
	}

		public static void main(String areg[]){ //메소드
			new A().m();
		}
}

class Auser
{
	public static void main(String arge[]){
		new A().m();
		System.out.println("name: " + new A().name);
	}
}