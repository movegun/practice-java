import java.util.*;

class B24 
{
	TreeSet<String> ts = new TreeSet<String>();
	void in(){
		ts.add("��");ts.add("����");ts.add("����");ts.add("�ܿ�");ts.add("����");
	}
	void out(){
		//Iterator e = ts.iterator(); //asc
		Iterator<String> e = ts.descendingIterator(); //desc
		while(e.hasNext()){
			String item = e.next();
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) 
	{
		
		B24 b = new B24();
		b.in();
		b.out();
	}
}