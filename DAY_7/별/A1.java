class A1 
{
	void m1(){//���簢��
		for (int i=0;i<5 ;i++ ){
			for (int j=0;j<4 ;j++ ){
				System.out.print("��");
			}
			System.out.println("��");
		}
		pln("");pln("");pln("");
	}
	

	void m2(){//�޺� �ﰢ��
		for (int i=1;i<6 ;i++ ){
			for (int j=0;j<i ;j++ ){
				p("��");
			}
			pln("");
		}
		pln("");pln("");pln("");
	}
	void m3(){// ������ �ﰢ��
		for (int i=1;i<6 ;i++ ){
			for (int j=5;j>0 ;j-- ){
				if (i<j){
					p("  ");
				}else p("��");

			}
		pln("");
		}pln("");pln("");pln("");
		
	}
	void m4(){ // �޺� ���ﰢ��
		for (int i= 1;i<6 ;i++ ){
			for (int j=6;j>0 ;j-- ){
				if (j>i){
					p("��");
				}
			}
			pln("");
		}pln("");pln("");pln("");
	}

	void m5(){ // ������ ���ﰢ��
		for (int i=1;i<6 ;i++ ){
			for (int j=5;j>0 ;j--){
				if (i<7-j){
					p("��");
				}else p("  ");
			}
			pln("");
		}pln("");pln("");pln("");
	}



	void p(String str){System.out.print(str);}
	void pln(String str){System.out.println(str);}

	public static void main(String[] args) 
	{
	 A1 a = new A1();
	 a.m1();
	 a.m2();
	 a.m3();
	 a.m4();
	 a.m5();
	 //a.m6();
	 }
}
