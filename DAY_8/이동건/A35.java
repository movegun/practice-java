import java.util.*;

class A35
{
	Vector<Boolean> v = new Vector<Boolean>();

	void in(){
        boolean flag = true;
        v.add(flag);v.add(false);v.add(true); v.add(m(9));
	}
	boolean m(int a){
		boolean b = false;
		if(a<10)
		   b = true;
		else 
		   b = false;

		return b;
	}
	void out(){
		for(int i=0; i<v.size(); i++){
			boolean item = v.get(i); //UnBoxing 
			System.out.println("item("+i+"): " + item);
		}
	}
	public static void main(String[] args) 
	{
		A35 a = new A35();
		a.in();
		a.out();
	}
}
