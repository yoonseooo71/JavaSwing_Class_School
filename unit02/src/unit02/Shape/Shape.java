package unit02.Shape;

public abstract class Shape {
	private String name;
	static final double PI = 3.14 ;
	static protected int shapeCnt = 0 ; 
	public Shape() {
		shapeCnt += 1 ; 
	}
	public Shape(String name) { 
		this();
		this.name = name ; 
	}
	abstract public void draw();
	abstract public void calculateArea(); 
	abstract public void calculateRound(); 
	
	
}
