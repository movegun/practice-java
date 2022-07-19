class Figure {
	void draw(){
		System.out.println("도형을 그린다");
	}
}
class Triangle extends Figure {
	void draw(){
		System.out.println("삼각형을 그린다");
	}
}
class Square extends Figure {  
	void draw(){
		System.out.println("사각형을 그린다");
	}
}
class Circle extends Figure {
	void draw(){
		System.out.println("원형을 그린다");
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
