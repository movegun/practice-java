import java.lang.*;
 class Human extends Object{
	 String name;
	 Human(){}
	 Human(String name){
		 super();
		 this.name = name;
	 }
	 void move(){
		 System.out.println("�ȴ´�");
	 }
}
class Superman extends Human
{
	int power = 100;
	Superman(){
		super("Ŭ��");
	}
	Superman(String name){
		this.name = name;
	}
	void move(){
		System.out.println("���ƴٴѴ�");
	}
	void shotBeam(){
		System.out.println("������ ���");
	}
}
class Pepsiman extends Human
{
	int speed = 200;
	void move(){
		System.out.println("�ڴ�");
	}
}
class God
{
	public static void main(String[] args) {
		//Human m1 = new Human("ȫ�浿");
		/*System.out.println(m1.name);
		m1.move();*/
		
		Superman sm1 = new Superman();
		/*System.out.println(sm1.name);
		System.out.println(sm1.power);
		sm1.move();
		sm1.shotBeam();*/
		
		Human man = sm1;
		System.out.println(man.name);
		//System.out.println(man.power);
		man.move();
		//man.shotBeam();

		Superman sman = (Superman)man;
		System.out.println("sman.name"+sman.name);
		System.out.println("sman.power"+sman.power);
		sman.move();
		sman.shotBeam();
	}
}
