
package unit02.Shape;

public class Circle extends Shape{
	protected int radius ; 	
	public Circle() {
		super();
	}
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius ; 
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 "+ radius+"인"+"원 그리기");
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("반지름:"+radius+"원의 넓이:"+(radius*radius*PI));
	}
	@Override
	public void calculateRound() {
		// TODO Auto-generated method stub
		System.out.println("반지름:"+radius+"원의 둘래:"+((radius+radius)*PI));
		
	}
}
