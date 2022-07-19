import java.io.*;
class A{
	String fname = "test.txt";
	A(){
		try{
			FileReader fr = new FileReader(fname);
			System.out.println(fname+"를 찾음");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int i = Integer.parseInt(Line);
			System.out.println("i :"+i);
		}catch(FileNotFoundException fe){
			System.out.println(fname+"못찾음");
		}catch(IOException ie){
			System.out.println("read()시 예외발생");
		}catch(NumberFormatException fe){
			System.out.println("숫자가 아닙니다");
		}
	}
	public static void main(String[] args)
	{
		A a = new A();
	}
}