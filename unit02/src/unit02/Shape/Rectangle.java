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
		System.out.println("����"+ width+"����"+height+"��"+"�簢�� �׸���");
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("����:"+width+"����:"+height+"����:"+(width * height));
	}
	@Override
	public void calculateRound() {
		// TODO Auto-generated method stub
		System.out.println("����:"+width+"����:"+height+"�ѷ�:"+(width + height)*2);
		
	}
}

