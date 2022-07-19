import java.util.*;

class C3
{
	Hashtable<Integer, String> m = new Hashtable<Integer, String>();
	void in(){
		m.put(1, "봄"); //AutoBoxing
		m.put(2, "여름");
		m.put(3, "가을");
		m.put(4, "겨울");
		m.put(5, "초여름");
	}
	void out(){
		Enumeration<Integer> keys = m.keys();
		while(keys.hasMoreElements()){



			int key = keys.nextElement(); //UnBoxing




			String value = m.get(key);
			System.out.println("key: " + key + ", value: " + value);
		}
	}
	public static void main(String[] args) 
	{
		C3 c = new C3();
		c.in();
		c.out();
	}
}

