import java.util.*;

class C11 
{
	Hashtable m = new Hashtable();
	void in(){
		m.put(new Integer(1), "봄");
		m.put(new Integer(2), "여름");
		m.put(new Integer(3), "가을");
		m.put(new Integer(4), "겨울");
		m.put(new Integer(2), "초여름");
	}
	void out(){
		Enumeration keys = m.keys();
		while(keys.hasMoreElements()){
			Object keyObj = keys.nextElement();
			Integer key = (Integer)keyObj;
			Object valueObj = m.get(key);
            String value = (String)valueObj;

			System.out.println("key: " + key + ", value: " + value);
		}
	}
	public static void main(String[] args) 
	{
		C11 c = new C11();
		c.in();
		c.out();
	}
}
