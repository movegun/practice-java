import java.util.*;

class C2 
{
	Hashtable<Integer, String> m = new Hashtable<Integer, String>();
	void in(){
		m.put(new Integer(1), "봄");
		m.put(new Integer(2), "여름");
		m.put(new Integer(3), "가을");
		m.put(new Integer(4), "겨울");
		m.put(new Integer(2), "초여름");
	}
	void out(){
		Enumeration<Integer> keys = m.keys();
		while(keys.hasMoreElements()){


			int key = keys.nextElement();





			String value = m.get(key);
			System.out.println("key: " + key + ", value: " + value);
		}
	}
	public static void main(String[] args) 
	{
		C2 c = new C2();
		c.in();
		c.out();
	}
}
