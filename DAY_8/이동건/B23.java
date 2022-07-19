import java.util.*;

class B23 
{
	TreeSet<String> ts = new TreeSet<String>();
	void in(){
		ts.add("봄");ts.add("여름");ts.add("가을");ts.add("겨울");ts.add("여름");
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
		
		B23 b = new B23();
		b.in();
		b.out();
	}
}