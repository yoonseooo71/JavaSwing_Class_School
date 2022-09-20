package unit03.LayoutExam;

import javax.swing.JFrame;

public class HelloSwing2 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame() ; 
		f.setTitle("안녕 스윙"); 
		f.setLocation(500,200);//창 처음 위치 지정 
		f.setSize(300,100) ; 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true);
	}

}
//