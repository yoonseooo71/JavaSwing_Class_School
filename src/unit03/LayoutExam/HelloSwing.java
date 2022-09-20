package unit03.LayoutExam;

import javax.swing.JFrame;
//2. jFrame 상속 받기 
public class HelloSwing extends JFrame {
	//생성자에서 화면 만들기 
	HelloSwing(){
		//3.화면 초기 세팅하기 
		setTitle("안녕스윙"); //이름 설정 
		setSize(300,100); //프레임 사이즈 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE); //창을닫았을떄 메모리도 지우는 세팅 
		setVisible(true); 
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.new 생성자() 롤 윈도우 프로그래밍 실행시키기
		new HelloSwing(); 
	}

}
