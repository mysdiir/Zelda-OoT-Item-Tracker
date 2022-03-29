package controller;


import view.GUI;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FrontendController {


    static int currentHeartPieceValue;
    static int currentSkulltulaValue;
    static int currentTriforceValue;
    static int maxTriforceValue;



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


    public static void addHeartPiece(int maxValue, JButton btnName, JProgressBar pbName, JLabel outputLabel) {

        int finalMaxValue = maxValue;
        btnName = btnName;
        JProgressBar finalPbName = pbName;
        JLabel finalOutputLabel = outputLabel;

        pbName.setMaximum(maxValue);

        btnName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (currentHeartPieceValue < finalMaxValue) {
                    currentHeartPieceValue = currentHeartPieceValue + 1;
                    finalPbName.setValue(currentHeartPieceValue);
                    // System.out.println("Value added");
                    finalOutputLabel.setText(String.valueOf(currentHeartPieceValue));
                }
            }
        });
    }

    public static void subtractHearPiece(int maxValue, JButton btnName, JProgressBar pbName, JLabel outputLabel) {

        maxValue = maxValue;
        btnName = btnName;
        JProgressBar finalPbName = pbName;
        JLabel finalOutputLabel = outputLabel;


        pbName.setMaximum(maxValue);

        btnName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (currentHeartPieceValue > 0) {
                    currentHeartPieceValue = currentHeartPieceValue - 1;
                    finalPbName.setValue(currentHeartPieceValue);
                    // System.out.println("Value subtracted");
                    finalOutputLabel.setText(String.valueOf(currentHeartPieceValue));

                }
            }
        });
    }

    public static void addSkulltula(int maxValue, JButton btnName, JProgressBar pbName, JLabel outputLabel) {

        int finalMaxValue = maxValue;
        btnName = btnName;
        JProgressBar finalPbName = pbName;
        JLabel finalOutputLabel = outputLabel;

        pbName.setMaximum(maxValue);

        btnName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (currentSkulltulaValue < finalMaxValue) {
                    currentSkulltulaValue = currentSkulltulaValue + 1;
                    finalPbName.setValue(currentSkulltulaValue);
                        System.out.println("Value added");
                    finalOutputLabel.setText(String.valueOf(currentSkulltulaValue));
                }
            }
        });
    }

    public static void subtractSkulltula(int maxValue, JButton btnName, JProgressBar pbName, JLabel outputLabel) {

        maxValue = maxValue;
        btnName = btnName;
        JProgressBar finalPbName = pbName;
        JLabel finalOutputLabel = outputLabel;


        pbName.setMaximum(maxValue);

        btnName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (currentSkulltulaValue > 0) {
                    currentSkulltulaValue = currentSkulltulaValue - 1;
                    finalPbName.setValue(currentSkulltulaValue);
                        System.out.println("Value subtracted");
                    finalOutputLabel.setText(String.valueOf(currentSkulltulaValue));

                }
            }
        });
    }


    public static void setTriforceValue(JButton BTNName, JTextField TFName, JProgressBar PBName) {

        BTNName = BTNName;
        JTextField finalTFName = TFName;
        JProgressBar finalPBName = PBName;

        BTNName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String tirforceValueString = finalTFName.getText();
                    // System.out.println(tirforceValueString);
                maxTriforceValue = Integer.parseInt(tirforceValueString);
                finalPBName.setMaximum(maxTriforceValue);
                    // System.out.println(finalPBName.getMaximum());

            }
        });
    }

    public static void addTriforce(JButton btnName, JProgressBar pbName, JLabel outputLabel) {

        btnName = btnName;
        JProgressBar finalPbName = pbName;
        JLabel finalOutputLabel = outputLabel;

        btnName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Add");
                System.out.println(currentTriforceValue + " " + maxTriforceValue);
                if (currentTriforceValue < maxTriforceValue) {
                    currentTriforceValue = currentTriforceValue + 1;
                    finalPbName.setValue(currentTriforceValue);
                       // System.out.println("Value added");
                    finalOutputLabel.setText(String.valueOf(currentTriforceValue));
                }
            }
        });
    }

    public static void subtractTriforce(JButton btnName, JProgressBar pbName, JLabel outputLabel) {

        btnName = btnName;
        JProgressBar finalPbName = pbName;
        JLabel finalOutputLabel = outputLabel;

        btnName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Subtract");
                if (currentTriforceValue > 0) {
                    currentTriforceValue = currentTriforceValue - 1;
                    finalPbName.setValue(currentTriforceValue);
                       // System.out.println("Value subtracted");
                    finalOutputLabel.setText(String.valueOf(currentTriforceValue));

                }
            }
        });
    }

}





