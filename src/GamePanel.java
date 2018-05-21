import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	private BufferedImage board;

	public GamePanel() {
		this.board = board;
		try {
			board = ImageIO.read(new File("res/Board (1).png"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(board, 0, 0, getWidth(), getHeight(), null);
	}
}
