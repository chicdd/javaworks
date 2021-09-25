package exercise;

import java.util.ArrayList;

class Shape{
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Triangle");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		//Shape 클래스를 참조하여 다형성으로 구현
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape s : list) {
			s.draw();
		}
	}

}
