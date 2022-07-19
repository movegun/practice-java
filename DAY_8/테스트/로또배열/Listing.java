import java.io.*;

class Listing 
{
	FileReader fr;
	BufferedReader br; 

	String fname = "¿ì¸®¹Ý.txt";
	String names[] = new String[25];
	void read(){
		try{
			fr = new FileReader(fname);
			br = new BufferedReader(fr);
			String line = "";
			int i = 0; 
			while((line = br.readLine()) != null){
				names[i++] = line;
			}
		}catch(IOException ie){
			System.out.println("ie: " + ie);
		}
	}
	void showArray(){
		for(int i=0; i<names.length; i++){
			System.out.println("names["+i+"]: " + names[i]);
		}
	}
	public static void main(String[] args) 
	{
		Listing list = new Listing();
		list.read();
		list.showArray();
	}
}
