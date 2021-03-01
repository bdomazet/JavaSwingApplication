package one.swing;

/*
*  1 container JFrame, JPannel - nisu vidljivi
*  2 ui controls JButton, JCheckbox, JRadioButton - vidljivi
*  3 LayoutManager - nisu vidljivi Borderlayout, GridBox, FlowManager
 */


import javax.swing.*;
import java.awt.*;

public class ButtonDemo {
    public static void main(String[] args) {
        ButtonPanel buttonPanel = new ButtonPanel();
        buttonPanel.setLayout(new FlowLayout());
        JFrame frame = new JFrame("Testni dugmici");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(buttonPanel);
        frame.getContentPane().setBackground(Color.WHITE);
        //frame.pack();
        frame.setSize(600,400);
        frame.setVisible(true);
    }
}

