class E 
{
	final int I = 10; //초기값을 못바꿈 	
	/*final E(){ //생성자는 오버라이딩 개념이 없으므로 
		System.out.println("E()");
	} */
	final void m(){ //오버라이딩 못함 
		final int J = 20;
		System.out.println("E의 m()");
	}
}