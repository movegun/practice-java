class �Ĵ� 
{
	String �޴�; //�������
	int ����;  //�������
	�Ĵ�(){
		�޴� = "���";
		���� = 5000;
	}
	�Ĵ�(String �޴�, int ����){
		this.�޴� = �޴�;
		this.���� = ����;
	}
	void ��θ����Ѵ�(){
		System.out.println("��θ����Ѵ�");
	}
}
class ����
{
	int ���� = 26; //�������
	String ���� = "����"; // �������
	�Ĵ� �Ļ�1, �Ļ�2; // ������� �������

	����(){
		System.out.println("������ "+ ���� +"�̰�, ���̰� "+����+"���� ������ ");
	}
	void �����(){
		�Ļ�1 = new �Ĵ�();
		�Ļ�2 = new �Ĵ�("���", 1000);
		System.out.println("�޴��� "+ �Ļ�1.�޴� +"�̰�, ������ " + �Ļ�1.���� +"���� ���ɰ� ");
		System.out.println("�޴��� "+ �Ļ�2.�޴� +"�̰�, ������ " + �Ļ�2.���� +"���� ������ ��������");
	}
	void �Ǵ�(�Ĵ� �Ļ�){
		System.out.println("�޴��� "+�Ļ�.�޴� +"�̰�, ������ " + �Ļ�.���� +"���� �޴��� �ȾҾ��");
	}
}

class ����
{
	public static void main(String args[]){
		���� �� = new ����();
		System.out.println();
		��.�����();
		System.out.println();
		��.�Ǵ�(��.�Ļ�1);
		��.�Ǵ�(��.�Ļ�2);
	}
}
