import java.io.*;

class Tip 
{
	String fname = "";
	BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));
	void readFile() throws IOException {
		p("����Ʈ ����(�⺻ : �츮�ݸ���Ʈ.txt) :");
		fname = brKey.readLine();
		if(fname != null) fname = fname.trim();
		if(fname.length() == 0) fname = "�츮�ݸ���Ʈ.txt";

		//pln("fname: " + fname);
		read();
	}	
	void read() throws IOException {
		String line = "";
		try{
			FileReader fr = new FileReader(fname);
			BufferedReader br = new BufferedReader(fr);	
			while((line=br.readLine()) != null){
				pln("line: " + line);
			}
		}catch(FileNotFoundException fe){
			System.out.println(fname+"������ ��ã��");
			readFile();
		}
	}
	void pln(String str){
		System.out.println(str);
	}
	void p(String str){
		System.out.print(str);
	}
	public static void main(String[] args) throws IOException
	{
		new Tip().readFile();
	}
}
