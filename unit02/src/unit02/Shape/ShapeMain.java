package unit02.Shape;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������� ������ ����:"+Shape.shapeCnt);
		System.out.println("===========================");
		Circle  circle = new Circle("�ȱ���",9) ;
		Rectangle rectangle = new Rectangle("���ʸ�",15,15) ;
		circle.draw();
		rectangle.draw();
		System.out.println("===========================");
		System.out.println("������� ������ ����:"+Shape.shapeCnt);
		System.out.println("===========================");
		circle.calculateArea();
		circle.calculateRound();
		System.out.println("===========================");
		rectangle.calculateArea();
		rectangle.calculateRound();
		
	}

}
