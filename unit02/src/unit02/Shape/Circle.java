
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
		System.out.println("�������� "+ radius+"��"+"�� �׸���");
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("������:"+radius+"���� ����:"+(radius*radius*PI));
	}
	@Override
	public void calculateRound() {
		// TODO Auto-generated method stub
		System.out.println("������:"+radius+"���� �ѷ�:"+((radius+radius)*PI));
		
	}
}
