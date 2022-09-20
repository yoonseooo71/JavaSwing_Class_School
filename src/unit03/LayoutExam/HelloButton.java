package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{
	public HelloButton() {
		//패널을 만들어서 프레임에 붙이기
		JPanel jp = new JPanel() ; 
		jp.setBackground(Color.LIGHT_GRAY);
		this.add(jp) ; 
		//컴포넌트 버튼을 생성해서 패널에 붙이기 
		JButton jbtn = new JButton("button");
		jbtn.setBackground(Color.cyan); 
		jp.add(jbtn) ; 
		
		
		setTitle("안녕"); 
		setSize(300,300); 
		setLocation(300,100); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true) ; //화면에 띄우는가 여부
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloButton() ;
		
	}

}
//