import java.util.*;

class A15 
{
	Vector v = new Vector();

	void in(){
        v.add("��");v.add("����");v.add("����");v.add("�ܿ�");
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
		A15 a = new A15();
		a.in();
		a.out();
	}
}
