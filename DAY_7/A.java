class A 
{
	void m1(){
		for (int i=1;i<10 ;i++ ){          //i개의 줄
			for (int j=0; j<i ;j++){       //j개의 별
				System.out.print("* ");
		}
		System.out.println("");
		}
		System.out.println("");System.out.println("");System.out.println("");
	}

	void m2(){// 올바른 삼각형
		int	a = 10;   // a개의 줄

		for (int i=1;i<a ;i++ ){		     //i개의 줄
			for (int j=0; j<i ;j++){       //j개의 별   처음부터 시작>> j=0 거꾸로삼각형 >>j=i보다1작게
					System.out.print("*");
				}
			System.out.println("");
		}
		System.out.println("");System.out.println("");System.out.println("");
	}
		

	void m3(){ // 반대로 삼각형
			   // a개의 줄

			for (int i=1;i<10 ;i++ ){		  // 10개의 줄
				for (int j=0; j<10 ;j++){       //한줄에 j개의 타점     닫히는곳을 정해줘야하니까 반대로 생각.

					if(i>j){
						System.out.print(" ");        // 왜 거꾸로 하는지?
					}else{
						System.out.print("*");
					}
				}				
				System.out.println("");
			}
			System.out.println("");System.out.println("");System.out.println("");
	}	

	void m4(){										//피라미드
		int	a = 10;								// 
		for (int i=0;i<a ;i++ ){			    //   a개의 줄 층수.
				for (int j=0; j<(a-1)-i ;j++){       //j개의 별
					System.out.print(" ");
				}
				for (int j=0;j<2*i+1 ;j++ ){      //양쪽 계단의 합이 2 3이면 곱하기3
					System.out.print("*");
				}
		System.out.println("");
		}
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");
	}

	void m5(){							//역삼각형
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
