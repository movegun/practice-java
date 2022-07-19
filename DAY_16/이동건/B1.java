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
			System.out.println("BI의 객체 생성 및 사용");
			BI bi = () ->{
				System.out.println("i : " + i); // i 대신 BOut.this.i 같은말
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
