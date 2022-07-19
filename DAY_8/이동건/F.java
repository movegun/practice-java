import java.util.*;

class F 
{
	ArrayList<String> list1 = new ArrayList<String>();
	ArrayList<String> list2 = new ArrayList<String>();
	Vector<ArrayList<String>> v = new Vector<ArrayList<String>>();

	void in(){
		list1.add("하나");list1.add("둘");list1.add("셋");
		list2.add("one");list2.add("two");list2.add("three");list2.add("four");
		v.add(list1); v.add(list2);
	}
	void out(){
		for(ArrayList<String> list : v){
			for(String item: list){
				System.out.println("item: " + item);
			}
		}
	}
	public static void main(String[] args) 
	{
		F f = new F();
		f.in();
		f.out();
	}
}
