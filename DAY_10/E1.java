import java.io.*;

class E 
{
	InputStream is = System.in;  
	PrintStream os = System.out;   
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void input() {
		String line = "";
		try{
			line = br.readLine();
			if(line != null) line = line.trim();
			os.println(line);
		}catch(IOException ie){
			System.out.println("����ó��");	
		}


        try{
			int i = Integer.parseInt(line);
			os.println("i:"+i);
		}catch(NumberFormatException ne){
			System.out.println("���ڸ� �Է°���");	
		}
	}
	public static void main(String[] args) 
	{
		new E().input();
	}
}
