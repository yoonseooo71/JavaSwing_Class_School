package unit03.LayoutExam;
import java.awt.*;

import javax.swing.*;
public class HelloBorderLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton btn1 = new JButton("North");
		JButton btn2 = new JButton("South");
		JButton btn3 = new JButton("East");
		JButton btn4 = new JButton("West");
		JButton btn5 = new JButton("Center");
		frame.setTitle("보더 레이아웃");
		frame.setSize(350,200); 
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(panel);
		panel.setLayout(new BorderLayout());
		panel.add(btn1,BorderLayout.NORTH);
		panel.add(btn2,BorderLayout.SOUTH);
		panel.add(btn3,BorderLayout.EAST);
		panel.add(btn4,BorderLayout.WEST);
		panel.add(btn5,BorderLayout.CENTER);
	}

}
