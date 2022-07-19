import java.util.*;

class Ran 
{
	int n = 2;
	Random r = new Random();
	void showNum(){
		int i = r.nextInt(n);// 0, 1
		System.out.println("i: " + i);
	}
	public static void main(String[] args) 
	{
		Ran ran = new Ran();
		ran.showNum();
	}
}
