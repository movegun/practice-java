class E2 
{
	/*String strs[] = new String[4];

	void in(){
		strs[0] = "�ϴ�";
		strs[1] = "�ٴ�";
		strs[2] = "����";
		strs[3] = "�ٶ�";
	}*/
	String strs[] = {"�ϴ�", "�ٴ�", "����", "�ٶ�"};
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
		E2 e = new E2();
		//e.in();
		e.out();
	}
}
