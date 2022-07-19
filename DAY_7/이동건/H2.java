class H2 
{
	void in(){
		int is1[] = {10, 20}; 
		int is2[] = {50};

		int iss[][] = {is1, {30, 40, 45}, is2}; 

		out(iss);
		outQ(iss);
	}
	void out(int iss[][]){

		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				System.out.println("iss["+i+"]["+j+"]: " + iss[i][j]);
			}
		}
	}
	void outQ(int iss[][]){
		for(int i=0; i<iss.length; i++){
			for(int j=0; j<iss[i].length; j++){
				System.out.println("iss["+i+"]["+j+"]: " + iss[i][j]);
			}
		}
	}
	public static void main(String[] args) 
	{
		H2 h = new H2();
		h.in();
	}
}
