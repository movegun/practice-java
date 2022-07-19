import java.io.*;
import java.util.*;

class LottoM 
{
	FileReader fr;
	BufferedReader br; 
	Random r;
	String fname ;
	//String names[] = new String[25];
	List<String> names = new ArrayList<>();	//계속 오류나서 멤버변수로 빼봤음
	BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
	int j=0;
	void readFile(){
		try{
			//String fname= "";
			System.out.println("명단이 있는 파일명을 입력하세요!!");
			System.out.println("엔터를 누르면 '우리반.txt'를 참조합니다!!");
			System.out.print("파일명 : ");
			fname = bi.readLine();
			if (fname != null) fname=fname.trim(); // 문자열이 존재한다면 ? trim해라. 공백만 존재한다면 다잘려서 텅빔
			if (fname.length()==0) fname="우리반.txt"; // 엔터만 치면 length가 0이므로 우리반.txt가 들어간다.
		}catch(IOException ie){
		}
	read();
	}
	void read(){
		try{
			fr = new FileReader(fname);
			br = new BufferedReader(fr); //메모장의 명단을 인식했음
			String name = "";			
			int i = 0;
			while((name = br.readLine()) != null){
				name= name.trim();
				names.add(i,name);
				
		//		System.out.println(names.get(i));    잘들어갔음 확인하고싶으면 주석해제
			}
		}catch(IOException ie){
			System.out.println("해당 파일을 찾을 수 없습니다!! 다시 확인 해주세요.");
			readFile();
		}
		//System.out.println(names.size());     list에선 length말고 size
		limit();
	}
	void limit(){
		int j=0;
		try{
			System.out.print("당첨자 수를 정하세요!!  당첨자수 : ");
			j = Integer.parseInt(bi.readLine());
			this.j = j;
			if (j<0||j>names.size()){
			System.out.println("입력가능한 숫자는 0 ~ "+names.size()+" 까지 입니다!!");
			limit();			
			}
			}catch(IOException ie){
			}catch(NumberFormatException ne){
			}
			choice();
	}
	void choice(){
	//	Random r = new Random();
	//	System.out.print(j);   //j에 내가 입력한 숫자가 들어갔음.
		Collections.shuffle(names);
		for (int i=0;i<j ;i++ ){
			System.out.println(names.get(i));
		}
		/*int a =r.nextInt(names.size());
		System.out.println("Index 번호  : "+ a);
		System.out.println("당첨된 사람 : " + names.get(a));*/
	
		
	}
		
		
		
	public static void main(String[] args) 
	{
		LottoM lo = new LottoM();
		lo.readFile();
		//lo.choice();
	}
}