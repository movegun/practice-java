class Figure {
	void draw(){
		System.out.println("������ �׸���");
	}
}
class Triangle extends Figure {
	void draw(){
		System.out.println("�ﰢ���� �׸���");
	}
}
class Square extends Figure {  
	void draw(){
		System.out.println("�簢���� �׸���");
	}
}
class Circle extends Figure {
	void draw(){
		System.out.println("������ �׸���");
	}
}

class B 
{
	public static void main(String[] args) 
	{
		Figure f1 = new Figure();
		Figure f2 = new Triangle();
		Figure f3 = new Square();
		Figure f4 = new Circle();
		f1.draw();
		f2.draw();
		f3.draw();
		f4.draw();
	}
}
