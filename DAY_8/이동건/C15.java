import java.util.*;

class C15 
{
	Hashtable m = new Hashtable();
	void in(){
		m.put(new Integer(1), "��");
		m.put(new Integer(2), "����");
		m.put(new Integer(3), "����");
		m.put(new Integer(4), "�ܿ�");
		m.put(new Integer(2), "�ʿ���");
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
		C15 c = new C15();
		c.in();
		c.out();
	}
}
