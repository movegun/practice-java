import java.io.*;
class A{
	String fname = "test.txt";
	A(){
		try{
			FileReader fr = new FileReader(fname);
			System.out.println(fname+"�� ã��");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int i = Integer.parseInt(Line);
			System.out.println("i :"+i);
		}catch(FileNotFoundException fe){
			System.out.println(fname+"��ã��");
		}catch(IOException ie){
			System.out.println("read()�� ���ܹ߻�");
		}catch(NumberFormatException fe){
			System.out.println("���ڰ� �ƴմϴ�");
		}
	}
	public static void main(String[] args)
	{
		A a = new A();
	}
}