import java.util.*;

class B12 
{
	TreeSet ts = new TreeSet();
	void in(){
		ts.add("��");ts.add("����");ts.add("����");ts.add("�ܿ�");ts.add("����");
	}
	void out(){
		//Iterator e = ts.iterator(); //asc
		Iterator e = ts.descendingIterator(); //desc
		while(e.hasNext()){
			Object obj = e.next();
			String item = (String)obj;
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) 
	{
		
		B12 b = new B12();
		b.in();
		b.out();
	}
}
