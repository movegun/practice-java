class F5 
{
	boolean flags[] = new boolean[4];
	void out1(){
		for(int i=0; i<flags.length; i++){
			System.out.println("flags["+i+"]: " + flags[i]);
		}
	}

	float fs[] = new float[2];
	void out2(){
		for(int i=0; i<fs.length; i++){
			System.out.println("fs["+i+"]: " + fs[i]);
		}	
	}

	F5 ff[] = new F5[3];
	void out3(){
		for(int i=0; i<ff.length; i++){
			System.out.println("ff["+i+"]: " + ff[i]);
		}	
	}
	public static void main(String[] args) 
	{
		F5 f = new F5();
		//f.out1();
		//f.out2();
		f.out3();
	}
}
