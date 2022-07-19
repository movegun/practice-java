import java.util.*;

class A13 
{
	Vector v = new Vector();

	void in(){
        v.add("봄");v.add("여름");v.add("가을");v.add("겨울");
	}
	void out(){
		for(int i=0; i<v.size(); i++){
			Object obj = v.get(i);
			String item = (String)obj;
			System.out.println("item("+i+"): " + item);
		}
	}
	public static void main(String[] args) 
	{
		A13 a = new A13();
		a.in();
		a.out();
	}
}
