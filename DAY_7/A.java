class A 
{
	void m1(){
		for (int i=1;i<10 ;i++ ){          //i���� ��
			for (int j=0; j<i ;j++){       //j���� ��
				System.out.print("* ");
		}
		System.out.println("");
		}
		System.out.println("");System.out.println("");System.out.println("");
	}

	void m2(){// �ùٸ� �ﰢ��
		int	a = 10;   // a���� ��

		for (int i=1;i<a ;i++ ){		     //i���� ��
			for (int j=0; j<i ;j++){       //j���� ��   ó������ ����>> j=0 �Ųٷλﰢ�� >>j=i����1�۰�
					System.out.print("*");
				}
			System.out.println("");
		}
		System.out.println("");System.out.println("");System.out.println("");
	}
		

	void m3(){ // �ݴ�� �ﰢ��
			   // a���� ��

			for (int i=1;i<10 ;i++ ){		  // 10���� ��
				for (int j=0; j<10 ;j++){       //���ٿ� j���� Ÿ��     �����°��� ��������ϴϱ� �ݴ�� ����.

					if(i>j){
						System.out.print(" ");        // �� �Ųٷ� �ϴ���?
					}else{
						System.out.print("*");
					}
				}				
				System.out.println("");
			}
			System.out.println("");System.out.println("");System.out.println("");
	}	

	void m4(){										//�Ƕ�̵�
		int	a = 10;								// 
		for (int i=0;i<a ;i++ ){			    //   a���� �� ����.
				for (int j=0; j<(a-1)-i ;j++){       //j���� ��
					System.out.print(" ");
				}
				for (int j=0;j<2*i+1 ;j++ ){      //���� ����� ���� 2 3�̸� ���ϱ�3
					System.out.print("*");
				}
		System.out.println("");
		}
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");
	}

	void m5(){							//���ﰢ��
		int a = 10;
		for (int i=1;i<a ;i++ ){
			for (int j =0; j<10-i ;j++ ){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
	}
}
