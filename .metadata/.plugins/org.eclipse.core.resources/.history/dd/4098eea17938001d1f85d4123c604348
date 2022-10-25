package unit03.LayoutExam;
import javax.swing.JFrame;
import javax.swing.JPanel;import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
public class HelloFlowLayout extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame() ; 
		JPanel panel = new JPanel() ;
		panel.setLayout(new FlowLayout());
		frame.add(panel) ; 
		for (int i =1 ; i<=7;i++) {
			JButton btn = new JButton(Integer.toString(i)) ; 
			btn.setBackground(Color.lightGray);
			panel.add(btn) ; 
		}
		
		frame.setTitle("ÇÁ·¹ÀÓ");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		frame.setVisible(true);
	}

}
//