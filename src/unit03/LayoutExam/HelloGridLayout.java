package unit03.LayoutExam;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class HelloGridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame() ;
		JPanel panel = new JPanel() ;
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();
		JButton btn6 = new JButton();
		JButton btn7 = new JButton(); 
		frame.setTitle("그리드 레이아웃");
		frame.setSize(350,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//패널 붙이기
		frame.add(panel);
		//panel 그리드레이아웃을 바꾸기
		panel.setLayout(new GridLayout(0,2,10,10));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		
	}

}
