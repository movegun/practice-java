import java.util.*;

class C33
{
	Hashtable<Integer, String> m = new Hashtable<Integer, String>();
	void in(){
		m.put(1, "��"); //AutoBoxing
		m.put(2, "����");
		m.put(3, "����");
		m.put(4, "�ܿ�");
		m.put(5, "�ʿ���");
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
		C33 c = new C33();
		c.in();
		c.out();
	}
}

