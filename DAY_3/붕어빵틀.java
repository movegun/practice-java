class  �ؾƲ
{
	String ���빰; //�������
	int ����;
	�ؾƲ(){
		���빰 = "��";
		���� = 500;
	}
	�ؾƲ(String ���빰, int ����){
		this.���빰 = ���빰;
		this. ���� = ����;
	}
	void ��θ����Ѵ�(){
		System.out.println("��θ����Ѵ�");
	}
}
class ����
{
}
class ��
{	
	public static void main(String[] args) {
		�ؾƲ �ؾ = new �ؾƲ();

		System.out.println(�ؾ.���빰+�ؾ.����);
	}
}