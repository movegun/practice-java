import java.util.*;

class B11 
{
	TreeSet ts = new TreeSet();
	void in(){
		ts.add("봄");ts.add("여름");ts.add("가을");ts.add("겨울");ts.add("여름");
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
		
		B11 b = new B11();
		b.in();
		b.out();
	}
}
