abstract class F 
{
	int i;
	//abstract F(); //�����ڴ� �������̵� ������ �����Ƿ�
	abstract void m1();
	void m2(){
		System.out.println("m2()");
	}
}
class FChild extends F
{
	void m1(){ //�������̵� 
		System.out.println("m1()");
	}
}

class FUser
{
	public static void main(String args[]){
		//F ��ü�� ����� ����Ͻÿ� : ���� �ð� ����.. ����!! 
		F f = new FChild();
		System.out.println("f.i: " + f.i);
		f.m1();
		f.m2();
	}
}
