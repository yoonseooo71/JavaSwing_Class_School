package unit03.LayoutExam;

import javax.swing.JFrame;
//2. jFrame ��� �ޱ� 
public class HelloSwing extends JFrame {
	//�����ڿ��� ȭ�� ����� 
	HelloSwing(){
		//3.ȭ�� �ʱ� �����ϱ� 
		setTitle("�ȳ罺��"); //�̸� ���� 
		setSize(300,100); //������ ������ ����
		setDefaultCloseOperation(EXIT_ON_CLOSE); //â���ݾ����� �޸𸮵� ����� ���� 
		setVisible(true); 
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.new ������() �� ������ ���α׷��� �����Ű��
		new HelloSwing(); 
	}

}
