package unit03.LayoutExam;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.JButton; 
public class HelloPanel extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame() ; 
		JPanel panel = new JPanel() ; 
		JButton btn1 = new JButton("버튼1") ;
		JButton btn2 = new JButton("버튼2") ;
		btn1.setBackground(Color.lightGray);
		btn2.setBackground(Color.lightGray);
		panel.setBackground(Color.orange);
		frame.add(panel) ; 
		panel.add(btn1) ; 
		panel.add(btn2) ; 
		frame.setTitle("프레임");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		frame.setVisible(true);
	}
}
