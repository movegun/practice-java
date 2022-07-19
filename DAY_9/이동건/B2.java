class Figure{
	void draw(){					//오버라이딩이 되있는지 확인하고 업으면 부모의 메소드를 그대로.
		System.out.println("도형을 그린다 ㅠㅠ");
	}
} 
class Triangle extends Figure{
	void draw(){
		System.out.println("삼각형을 그려");
	}
}
class Square extends Figure{
	void draw(){
		System.out.println("사각형을 그린다");
	}
}
class Circle extends Figure{
	void draw(){
		System.out.println("원을 그린다");
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
