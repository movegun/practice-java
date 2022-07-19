class I3 
{
	int is[] = {1, 2};
	int iss[][] = {is, {30, 40, 50}};
	int isss[][][] = {iss, {{60, 70}, {80}}, {{90, 100}} };

	void out(){
		for(int i=0; i<isss.length; i++){
			for(int j=0; j<isss[i].length; j++){
				for(int k=0; k<isss[i][j].length; k++){
					System.out.println("isss["+i+"]["+j+"]["+k+"]: " + isss[i][j][k]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		I3 i = new I3();
		i.out();
	}
}
