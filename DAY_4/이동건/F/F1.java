class F1 
{
	void m1(){
		boolean b = 1<2; //false
		if(b)
			System.out.println("�´� ���̴�");
	}

	int i;
	void m2(){
		i=-3;
		if(i<0){
			System.out.println("�����̴�");
		}else if(i>0){
			System.out.println("����̴�");
		}else{
			System.out.println("0�̴�");
		}
	}
	public static void main(String[] args) 
	{
		F1 f = new F1();
		//f.m1();
		f.m2();
	}
}
