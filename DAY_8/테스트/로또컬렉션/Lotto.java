import java.io.*;
import java.util.*;

class Lotto 
{
	FileReader fr;
	BufferedReader br; 
	Random r;
	String fname = "우리반.txt";
	//String names[] = new String[25];
	List<String> names = new ArrayList<>();	//계속 오류나서 멤버변수로 빼봤음

	void read(){
		try{
			
			fr = new FileReader(fname);
			br = new BufferedReader(fr); //메모장의 명단을 인식했음
			String name = "";			
			int i = 0;
			while((name = br.readLine()) != null){
				names.add(i,name);
		//		System.out.println(names.get(i));    잘들어갔음
			}
		}catch(IOException ie){
			System.out.println("ie: " + ie);
		}
		//System.out.println(names.size());     list에선 length말고 size
		choice();
	}
	void choice(){

		Random r = new Random();
		int a =r.nextInt(names.size());

		System.out.println(a + names.get(a));
	}
		
		
		
	public static void main(String[] args) 
	{
		Lotto lo = new Lotto();
		lo.read();
		//lo.choice();
	}
}