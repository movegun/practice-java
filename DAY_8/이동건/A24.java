import java.util.*;

class A24 
{
	Vector<String> v = new Vector<String>();

	void in(){
        v.add("봄");v.add("여름");v.add("가을");v.add("겨울");
	}
	void out(){
		for(int i=0; i<v.size(); i++){
			String item = v.get(i);
			System.out.println("item("+i+"): " + item);
		}
	}
	public static void main(String[] args) 
	{
		A24 a = new A24();
		a.in();
		a.out();
	}
}
