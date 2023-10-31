package game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 300;
    final int PANEL_HEIGHT = 300;
    Image chicken;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    AnimationPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        chicken = new ImageIcon("src/game/chicken.png").getImage();
        timer = new Timer(500, null);
    }
    public void paint (Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(chicken, x, y , null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
