import java.util.*;

class C21 
{
	Hashtable<Integer, String> m = new Hashtable<Integer, String>();
	void in(){
		m.put(new Integer(1), "��");
		m.put(new Integer(2), "����");
		m.put(new Integer(3), "����");
		m.put(new Integer(4), "�ܿ�");
		m.put(new Integer(2), "�ʿ���");
	}
	void out(){
		Enumeration<Integer> keys = m.keys();
		while(keys.hasMoreElements()){
			Integer key = keys.nextElement();
			String value = m.get(key);
			System.out.println("key: " + key + ", value: " + value);
		}
	}
	public static void main(String[] args) 
	{
		C21 c = new C21();
		c.in();
		c.out();
	}
}
