package bubble.test.ex04;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

// calss Player -> new 가능한 애들!! 게임에 존재할 수 있음. (추상메서드를가질 수 없다.)

public class Player extends JLabel implements Moveable{
	
	// 위치 상태
	private int x;
	private int y;
	
	//움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public ImageIcon getPlayerR() {
		return playerR;
	}

	public void setPlayerR(ImageIcon playerR) {
		this.playerR = playerR;
	}

	public ImageIcon getPlayerL() {
		return playerL;
	}

	public void setPlayerL(ImageIcon playerL) {
		this.playerL = playerL;
	}
	
	
	private ImageIcon playerR, playerL;
	
	public Player() {
		
		initObject();
		initSetting();
		
	}
	
	private void initObject() {
		
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
	}
	
	private void initSetting() {
		
		x = 55;
		y = 535;
		
		// 최초의 상태
		left = false;
		right = false;
		up = false;
		down = false;
		
		setIcon(playerR);
		setSize(50,50);
		setLocation(x,y);
	}

	@Override
	public void up() {		
		
	}

	@Override
	public void down() {

		
	}

	@Override
	public void left() {
		System.out.println("left");
		left = true;
		new Thread(()-> {
			while(left) {
				setIcon(playerL);
				x = x-1;
				setLocation(x,y);
				try {
					Thread.sleep(10); // 0.01
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
			
		}).start();
		
	}

	@Override
	public void right() {
		System.out.println("right");
		right = true;
		new Thread(()-> {
			while(right) {
			setIcon(playerR);
			x = x+1;
			setLocation(x,y);
			try {
				Thread.sleep(10); // 0.01
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			}
		}).start();
		
		
		
	}
}
