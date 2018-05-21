import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TowerDefenseMain extends JPanel{

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame window = new JFrame("Tower Defense");
		JPanel content = new GamePanel();
		window.setSize(screenSize.width, screenSize.height);
		content.setSize(screenSize.width, screenSize.height);
		window.setContentPane(content);
		window.setVisible(true);
		
		Base base = new Base();
		while(base.getGameOver() == false) {
			
		}
	}
}