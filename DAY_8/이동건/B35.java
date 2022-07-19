import java.util.*;

class B35
{
	TreeSet<Double> ts = new TreeSet<Double>();
	void in(){
		double d = 3.0f;
		ts.add(2.0);ts.add(1.0);ts.add(1.5);ts.add(d); //AutoBoxing
	}
	void out(){
		Iterator<Double> e = ts.descendingIterator(); 
		while(e.hasNext()){
			double item = e.next(); //UnBoxing
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) 
	{
		
		B35 b = new B35();
		b.in();
		b.out();
	}
}