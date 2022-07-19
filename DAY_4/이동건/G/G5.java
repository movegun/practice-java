class G5 
{
	void m1(){
		int i=1;
		switch(i){
			case 0: System.out.println("0이다");
					break;
			case 1: System.out.println("1이다");
					char c ='B';
					switch(c){
							case 'A': System.out.println("A이다");
								break;
							case 'B': System.out.println("B이다");
								break;
							case 'C': System.out.println("C이다");
					}
					System.out.println("스위치2 밖으로 나왔다");
					break;
			case 2: System.out.println("2이다");
					break;
			default: System.out.println("0 1 2 가 아닌 정수이다");
		}
		System.out.println("스위치 밖으로 나왔다");
	}
	void m2(){
		String s ="여름";
		switch(s){
			case"봄":System.out.println("봄");break;
			case"여름":System.out.println("여름");break;
			case"가을":System.out.println("가을");break;
			case"겨울":System.out.println("겨울");
		}
		System.out.println("스위치 밖으로 나왔다");
	}
	public static void main(String[] args) 
	{
		G5 g = new G5();
		g.m1();
		g.m2();
	}
}
