package view;

import javax.swing.*;

public class GUI extends JFrame{
    public JPanel mainWindow;
    public JPanel coreItemsPanel;
    private JPanel kokiriSwordPanel;
    private JPanel masterSwordPanel;
    private JPanel brknBiggoronSwordPanel;
    private JPanel biggoronSwordPanel;
    private JPanel kokiriShieldPanel;
    private JPanel hylianShieldPanel;
    private JPanel mirrorShieldPanel;
    private JPanel goronTunicPanel;
    private JPanel zoraTunicPanel;
    private JPanel ironBootsPanel;
    private JPanel hoverBootsPanel;
    private JLabel kokiriSwordPic;


    public void setGUI() {
        setContentPane(mainWindow);
        setSize(600, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.add(coreItemsPanel);
        setVisible(true);
    }
}
