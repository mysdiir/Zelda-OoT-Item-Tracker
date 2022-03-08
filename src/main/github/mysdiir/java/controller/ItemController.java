package controller;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ItemController {



    public static void setItemToggle(JPanel PanelName) {
        PanelName = PanelName;
        JPanel finalPanelName = PanelName;

        Color passiveGrey = new Color(78,87,85);
        finalPanelName.setBorder(BorderFactory.createLineBorder(passiveGrey));

        PanelName.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                if (SwingUtilities.isLeftMouseButton(e)) {
                    Color activeGreen = new Color(130, 235, 129);
                    Color passiveGrey = new Color(78, 87, 85);

                    if (passiveGrey.equals(finalPanelName.getBackground())) {
                        finalPanelName.setBackground(activeGreen);
                        //System.out.println("Turn on");
                    } else {
                        finalPanelName.setBackground(passiveGrey);
                        //System.out.println("Turn off");
                    }
                }

                if (SwingUtilities.isRightMouseButton(e)) {
                    if (((LineBorder)finalPanelName.getBorder()).getLineColor() == passiveGrey) {
                        finalPanelName.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                        //System.out.println(((LineBorder) finalPanelName.getBorder()).getLineColor());
                    } else if (((LineBorder)finalPanelName.getBorder()).getLineColor() == Color.WHITE) {
                        finalPanelName.setBorder(BorderFactory.createLineBorder(passiveGrey));
                        //System.out.println(((LineBorder) finalPanelName.getBorder()).getLineColor());
                    }
                }
            }
        });

    }

    MainGUI mainGUIReference = new MainGUI();


    public void setScareScrowSong() {
      String scareScrowSong = "";
        // !!!implement changeListener for automatic saving

       scareScrowSong = mainGUIReference.scarScrowTextPanel.getText();
        System.out.println("input saved as " + scareScrowSong);
    }

    public void setItemFunctions(JPanel PanelName) {
        PanelName = PanelName;
        setItemToggle(PanelName);
    }



}




