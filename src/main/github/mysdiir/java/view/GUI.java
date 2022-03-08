package view;

import javax.swing.*;

public class GUI extends JFrame{
    public JPanel mainWindow;
    public JPanel coreItemsPanel;
    public JPanel kokiriSwordPanel;
    public JPanel masterSwordPanel;
    public JPanel brknBiggoronSwordPanel;
    public JPanel biggoronSwordPanel;
    public JPanel kokiriShieldPanel;
    public JPanel hylianShieldPanel;
    public JPanel mirrorShieldPanel;
    public JPanel goronTunicPanel;
    public JPanel zoraTunicPanel;
    public JPanel ironBootsPanel;
    public JPanel hoverBootsPanel;
    public JLabel kokiriSwordPic;
    public JLabel masterSwordPic;
    public JLabel brknBiggoronSwordPic;
    private JLabel biggoronSwordPic;
    private JLabel kokiriShieldPic;
    private JLabel hylianShieldPic;
    private JLabel mirrorShieldPic;
    private JPanel kokiriTunicPanel;
    private JLabel kokiriTunicPic;
    private JLabel goronTunicPic;
    private JLabel zoraTunicPic;
    private JPanel kokiriBootsPanel;
    private JLabel kokiriBootsPic;
    private JLabel ironBootsPic;
    private JLabel hoverBootsPic;


    public void setGUI() {
        setContentPane(mainWindow);
        setSize(600, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.add(coreItemsPanel);
        setVisible(true);
    }
}
