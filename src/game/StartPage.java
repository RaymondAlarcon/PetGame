package game;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton startButton = new JButton("Start");
    AnimationPanel animationPanel = new AnimationPanel();
    StartPage(){
        startButton.setBounds(170, 175, 60, 30);
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        animationPanel.setBounds(150, 50, 100, 100);

        frame.add(startButton);
        frame.add(animationPanel);


        //frame.pack();
        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new java.awt.Color(21,20,38));
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
