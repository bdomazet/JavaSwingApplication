package one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* 1 Container
* 2 UI controls - user interface controls
* 3 LayoutManager
*
 */

public class SwingObserverExample {
    private JFrame frame;


    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        AngelListener angelListener = new AngelListener();
        DevilListener devilListener = new DevilListener();
        button.addActionListener(angelListener);
        button.addActionListener(devilListener);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.getContentPane().add(button, BorderLayout.NORTH);
        frame.setSize(400,400);
        frame.setBackground(Color.YELLOW);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Nemoj, zazalices..");
        }
    }

    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Uradi to, neces zazaliti..");
        }
    }
}
