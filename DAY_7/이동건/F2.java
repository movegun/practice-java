class F2 
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

	F2 ff[] = new F2[3];
	void out3(){
		for(int i=0; i<ff.length; i++){
			System.out.println("ff["+i+"]: " + ff[i]);
		}	
	}
	public static void main(String[] args) 
	{
		F2 f = new F2();
		//f.out1();
		//f.out2();
		f.out3();
	}
}
