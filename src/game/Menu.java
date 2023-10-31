package game;

import javax.swing.*;

public class Menu {
    JFrame frame = new JFrame();
    JButton newButton = new JButton();
    JButton savesButton = new JButton();
    JButton settingsButton = new JButton();


    public static void Menu() {

        frame.setSize(800,600);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
