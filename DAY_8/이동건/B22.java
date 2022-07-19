import java.util.*;

class B22 
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
		
		B22 b = new B22();
		b.in();
		b.out();
	}
}