package bubble.test.ex02;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

// 윈도우 창이 되었음.
// 윈도우 창은 내부에 패널을 하나씩 가지고 있다.
public class BubbleFrame extends JFrame{
	
	private JLabel backgroundMap;
	private Player player;
	
	
	
	public BubbleFrame() {
		initSetting();
		initObject();
		
		setVisible(true);
		
	}

	private void initObject() {
		
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		
		player = new Player();
		add(player); // add를 사용하는이유는 setContentPane(backgroundMap) 위에 덧붙이기 위함.

//		backgroundMap.setLocation(300, 300);
//		backgroundMap.setSize(100,100);
//		backgroundMap.setSize(1000,600);
//		getContentPane().add(backgroundMap); // JRrame에 JLabel이 그려진다.
		
		
	}
	
	private void initSetting() {
		setSize(1000,640);
		setLayout(null); // absoulte 레이아웃(자유롭게 그림을 그릴 수 있다.
		setLocationRelativeTo(null); // JFrame 을 가운데 배치하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 창을 뜰 때 JVM 같이 종료하기
		
	}
	
	public static void main(String[] args) {

		new BubbleFrame();
	}
	}
