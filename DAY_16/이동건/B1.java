interface BI
{
	void m();
}
class BOut
{
	private int i = 1 ;
	class BIn
	{
		private int j = 2 ;
		void use(){
			System.out.println("BI�� ��ü ���� �� ���");
			BI bi = () ->{
				System.out.println("i : " + i); // i ��� BOut.this.i ������
				System.out.println("j : " + j);
			};
			bi.m();
		}
	}
}
class B
{
	public static void main(String[] args) 
	{
		BOut.BIn bin = new BOut().new BIn();
		bin.use();
	}
}
