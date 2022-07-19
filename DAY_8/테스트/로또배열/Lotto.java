import java.io.*;
import java.util.*;

class Lotto //�츮�� Ư���� �̸��� �����ϰ� ����ϴ� Ŭ���� 
{
	FileReader fr;
	BufferedReader br; 

    int total;
	String fname = "�츮��.txt";
	String names[]; //1) ���� 
	Lotto(){
		try{
			fr = new FileReader(fname);
			br = new BufferedReader(fr);
			String line = "";
			int i = 0; 
			while((line = br.readLine()) != null){
				line = line.trim();
				//System.out.println("line.length(): " + line.length());
				if(line.length() != 0) total++;
			}

			names = new String[total]; //2) ���� 
		}catch(IOException ie){
		}
		//System.out.println("total: " + total);
	}
	void read(){
		try{
			fr = new FileReader(fname);
			br = new BufferedReader(fr);
			String line = "";
			int i = 0; 
			while((line = br.readLine()) != null){
				line = line.trim();
				if(line.length() != 0) names[i++] = line; //3) �ʱ�ȭ : in  
			}
		}catch(IOException ie){
			System.out.println("ie: " + ie);
		}
	}
	/*void showArray(){
		for(int i=0; i<names.length; i++){
			System.out.println("names["+i+"]: " + names[i]);
		}
	}*/
	Random r = new Random();
	void showNum(){
		int i = r.nextInt(total);
		System.out.println("��÷��: " + names[i]); //out 
	}
	public static void main(String[] args) 
	{
		Lotto lo = new Lotto();
		lo.read();
		lo.showNum();
	}
}

//Listing.java, Ran.java�� �����ؼ�... 
