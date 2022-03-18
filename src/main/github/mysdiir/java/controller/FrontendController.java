package controller;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrontendController {

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
                    Color activeGreen = new Color(181, 243, 181);
                    Color passiveGrey = new Color(95, 106, 104);

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

    public static void toggleKey(JPanel panelName, JLabel labelName, int maxKeyValue) {
        JPanel finalPanelName = panelName;
        JLabel finalLabelName = labelName;
        int finalMaxKeyValue = maxKeyValue;


        Color activeGreen = new Color(181, 243, 181);
        Color passiveGrey = new Color(95, 106, 104);

        panelName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                int currentKeyValue = Integer.parseInt(finalLabelName.getText());


                if (SwingUtilities.isLeftMouseButton(e)) {
                   if (currentKeyValue == finalMaxKeyValue) return;
                   if (currentKeyValue == 0) {
                       finalPanelName.setBackground(activeGreen);
                   }
                   if (currentKeyValue >= 0) {
                           currentKeyValue = currentKeyValue + 1;
                           finalLabelName.setText(String.valueOf(currentKeyValue));
                                //System.out.println(currentKeyValue);
                   }
                }

                if (SwingUtilities.isRightMouseButton(e)) {
                    if (currentKeyValue == 0) return;
                    if (currentKeyValue == 1) {
                        finalPanelName.setBackground(passiveGrey);
                    }
                    if (currentKeyValue <= maxKeyValue) {
                        currentKeyValue = currentKeyValue - 1;
                        finalLabelName.setText(String.valueOf(currentKeyValue));
                                //System.out.println(currentKeyValue);
                    }

                }

            }
        });
    }


}




