package unit02.Shape;

public class Rectangle extends Shape{
	protected int width,height ; 	
	public Rectangle() {
		super();
	}
	public Rectangle(String name, int width,int height) {
		super(name);
		this.width = width ; 
		this.height = height ; 
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("가로"+ width+"세로"+height+"인"+"사각형 그리기");
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("가로:"+width+"세로:"+height+"넓이:"+(width * height));
	}
	@Override
	public void calculateRound() {
		// TODO Auto-generated method stub
		System.out.println("가로:"+width+"세로:"+height+"둘레:"+(width + height)*2);
		
	}
}

