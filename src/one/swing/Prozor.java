package one.swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Prozor {
    public static void main(String[] args) {


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); //difoltno je izabran flowlayout
        for (int i=0; i<10; i++){
            int j = i+1;
            JButton button = new JButton("Button " + j);
            panel.add(button);
        }

        JFrame frame = new JFrame("FlowLayout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
