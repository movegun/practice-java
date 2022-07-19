package aa.bb; // 패키지 선언 가장 상단에 위치

import java.lang.system; //임포트 구문
import java.lang.string;

class A {
	String name = "이동건"; 
	int age = 23;
	A(){ 
		System.out.println("A()");
	}
	A(String na, int a){
		name = na;
		age = a;
		}
	void m1(){ 
		System.out.println("m()");
	}


}




class Auser
{
	public static void main(String arge[]){
		A a = new A("강백호", 26);
		System.out.println("이름: " + a.name);
		System.out.println("나이: " + a.age);


	}
}