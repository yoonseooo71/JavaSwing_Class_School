package unit02.Shape;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("만들어진 도형의 개수:"+Shape.shapeCnt);
		System.out.println("===========================");
		Circle  circle = new Circle("안기모띠",9) ;
		Rectangle rectangle = new Rectangle("왁초릭",15,15) ;
		circle.draw();
		rectangle.draw();
		System.out.println("===========================");
		System.out.println("만들어진 도형의 개수:"+Shape.shapeCnt);
		System.out.println("===========================");
		circle.calculateArea();
		circle.calculateRound();
		System.out.println("===========================");
		rectangle.calculateArea();
		rectangle.calculateRound();
		
	}

}
