class G3 
{
	void m1(){
		int i=1;
		switch(i){
			case 0: System.out.println("0�̴�");
					break;
			case 1: System.out.println("1�̴�");
					char c ='B';
					switch(c){
							case 'A': System.out.println("A�̴�");
								break;
							case 'B': System.out.println("B�̴�");
								break;
							case 'C': System.out.println("C�̴�");
					}
					System.out.println("����ġ2 ������ ���Դ�");
					break;
			case 2: System.out.println("2�̴�");
					break;
			default: System.out.println("0 1 2 �� �ƴ� �����̴�");//������ break ����
		}
		System.out.println("����ġ ������ ���Դ�");
	}
	void m2(){
		String s ="����";
		switch(s){
			case"��":System.out.println("��");break;
			case"����":System.out.println("����");break;
			case"����":System.out.println("����");break;
			case"�ܿ�":System.out.println("�ܿ�");
		}
		System.out.println("����ġ ������ ���Դ�");
	}
	public static void main(String[] args) 
	{
		G3 g = new G3();
		g.m1();
		g.m2();
	}
}
