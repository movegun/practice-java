package aa.bb; // ��Ű�� ���� ���� ��ܿ� ��ġ

import java.lang.system; //����Ʈ ����
import java.lang.string;

class A {
	String name = "�̵���"; 
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
		A a = new A("����ȣ", 26);
		System.out.println("�̸�: " + a.name);
		System.out.println("����: " + a.age);


	}
}