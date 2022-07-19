class G1 
{
	byte b = 10;
	short s = 20;
	char c = 30;
	int i = 40;
	float f = 50.1f;
	void in(){
		int is[] = {b, s, c, i, (int)f};

		out(is);
	}
	void out(int is[]){
		for(int i=0; i<is.length; i++){
			System.out.println("is["+i+"]: " + is[i]);
		}
	}
	public static void main(String[] args) 
	{
		G1 g = new G1();
		g.in();
	}
}
