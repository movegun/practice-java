class A {
	String name = "�̵���"; //������� Ŭ���� ���� �ٷ� ���� �� �ִ�.
	A(){ //������ Ŭ������ �̸��� �Ȱ���
		System.out.println("A()");
	}
	void m(){ // �޼ҵ� Ŭ���� �տ� ���ü� �ִ� 3��
		System.out.println("m()");
	}

		public static void main(String areg[]){ //�޼ҵ�
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