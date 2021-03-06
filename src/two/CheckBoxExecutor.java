package two;

import javax.swing.*;
import java.util.concurrent.Callable;

public class CheckBoxExecutor {
    public static void main(String[] args) {
        /*String name = "Albin";
        String surname = "Fehric";
        String fullName = name+surname;
        String fulName1 = new StringBuilder().append(name).append(surname);*/
        SwingUtilities.invokeLater(CheckBoxExecutor::createGUI);


    }

    static void createGUI(){
        System.out.println(Thread.currentThread().getName());
        JFrame frame = new JFrame("Check box usage demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CheckBoxPanel checkBoxPanel = new CheckBoxPanel();
        frame.setContentPane(checkBoxPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
