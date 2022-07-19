import java.io.*;
import java.util.*;

class Lotto 
{
	FileReader fr;
	BufferedReader br; 
	Random r;
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
	void choice(){
		for(int i=0; i<names.length; i++){
		//	System.out.println("names["+i+"]: " + names[i]);
		}
		Random r = new Random();
		int a =r.nextInt(names.length);

		System.out.println("names["+a+"]: " + names[a]);
	}
		
		
		
	public static void main(String[] args) 
	{
		Lotto lo = new Lotto();
		lo.read();
		lo.choice();
	}
}