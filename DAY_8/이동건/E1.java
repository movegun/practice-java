class E1 
{
	/*String strs[] = new String[4];

	void in(){
		strs[0] = "하늘";
		strs[1] = "바다";
		strs[2] = "구름";
		strs[3] = "바람";
	}*/
	String strs[] = {"하늘", "바다", "구름", "바람"};
	void out(){
		/*for(int i=0; i<strs.length; i++){
			System.out.println("strs["+i+"]: " + strs[i]);
		}*/
		for(String item: strs){
			System.out.println(item);
		}
	}
	public static void main(String[] args) 
	{
		E1 e = new E1();
		//e.in();
		e.out();
	}
}
