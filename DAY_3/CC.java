class CC 
{
	int i; //��ü�̸� �Ҽ�
	static int j; //Ŭ�����̸� �Ҽ� , ����ƽ�� �����ϱ� Ŭ���� 
}
class CCUser
{
	public static void main(String[] args) 
	{
		CC cc = new CC();
		System.out.println("cc.i: " + cc.i);
		System.out.println("CC.j: " + CC.j);
	}
}
