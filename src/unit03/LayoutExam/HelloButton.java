package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{
	public HelloButton() {
		//�г��� ���� �����ӿ� ���̱�
		JPanel jp = new JPanel() ; 
		jp.setBackground(Color.LIGHT_GRAY);
		this.add(jp) ; 
		//������Ʈ ��ư�� �����ؼ� �гο� ���̱� 
		JButton jbtn = new JButton("button");
		jbtn.setBackground(Color.cyan); 
		jp.add(jbtn) ; 
		
		
		setTitle("�ȳ�"); 
		setSize(300,300); 
		setLocation(300,100); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true) ; //ȭ�鿡 ���°� ����
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloButton() ;
		
	}

}
//