class G 
{
	G(){
		m1();
		System.out.println("G()�� ��");
	}
	void m1(){
		for(int i=0; i<5; i++){
			if(i==2) return;
			System.out.println("i: " + i);
		}
		System.out.println("loop����");
	}
	public static void main(String[] args) 
	{
		G g = new G();
		System.out.println("main()�� ��");
	}
}
