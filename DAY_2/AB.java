class �ؾƲ 
{
	String ���빰;
	�ؾƲ(){
		���빰 = "��";
		System.out.println("�Ӳ��� " + ���빰 + "�� �ؾ�� �����ƴ�");
	}
	�ؾƲ(String �Ӳ�){
		���빰 = �Ӳ�;
		System.out.println("�Ӳ��� " + ���빰 + "�� �ؾ�� �����ƴ�2");
	}		
	void ��θ����մϴ�(){
		System.out.println("��θ����մϴ�");
	}
}

class B
{
	public static void main(String[] args) {
		�ؾƲ �ؾ1 = new �ؾƲ();
		�ؾƲ �ؾ2 = new �ؾƲ("��ũ��");

		
		System.out.println("ù��° �ؾ�� ���빰��" + �ؾ1.���빰+"�̰�, �ι�° �ؾ�� ���빰�� "+�ؾ2.���빰+ "�̴�");
	}
}
