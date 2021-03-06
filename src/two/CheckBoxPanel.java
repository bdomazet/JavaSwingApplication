package two;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class CheckBoxPanel extends JPanel {
    private JCheckBox chinCheckBox;
    private JCheckBox glassesCheckBox;
    private JCheckBox hairCheckBox;
    private JCheckBox teethCheckBox;

    private StringBuffer choices;
    private JLabel pictureLabel;
    private CheckBoxListener checkBoxListener = new CheckBoxListener();


    public CheckBoxPanel() {
        super(new BorderLayout());
        chinCheckBox = createJCheckBox("Ching", KeyEvent.VK_C, true);
        glassesCheckBox = createJCheckBox("Glasses", KeyEvent.VK_G, true);
        hairCheckBox = createJCheckBox("Hair", KeyEvent.VK_H, true);
        teethCheckBox = createJCheckBox("Teeth", KeyEvent.VK_T, true);

        choices = new StringBuffer("cght");

        pictureLabel = new JLabel();
        setupPicture();

        JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.add(chinCheckBox);
        checkPanel.add(glassesCheckBox);
        checkPanel.add(hairCheckBox);
        checkPanel.add(teethCheckBox);

        add(checkPanel, BorderLayout.LINE_START);
        add(pictureLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    }

    private void setupPicture() {
        String imageName = "geek-" + choices.toString() + ".gif";
        ImageIcon imageIcon = loadImage(imageName);
        if (imageIcon != null) {
            pictureLabel.setIcon(imageIcon);
            pictureLabel.setToolTipText(imageName);
        } else {
            pictureLabel.setText("Missing image");
        }

    }

    private ImageIcon loadImage(String imageName) {
        URL imageUrl = CheckBoxPanel.class.getResource(imageName);
        if (imageUrl != null) {
            return new ImageIcon(imageUrl);
        } else {
            System.err.println("Ne mogu naci sliku" + imageName);
            return null;
        }
    }

    private JCheckBox createJCheckBox(String text, int keyEvent, boolean selected) {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setMnemonic(keyEvent);
        checkBox.setSelected(selected);
        checkBox.addItemListener(checkBoxListener);
        return checkBox;
    }

    private class CheckBoxListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            int index = 0;
            char caracter = '-';
            Object source = event.getItemSelectable();
            if (chinCheckBox == source) {
                index = 0;
                caracter = 'c';
            } else if (glassesCheckBox == source) {
                index = 1;
                caracter = 'g';
            } else if (hairCheckBox == source) {
                index = 2;
                caracter = 'h';
            } else if (teethCheckBox == source) {
                index = 3;
                caracter = 't';
            }
            if (event.getStateChange() == ItemEvent.DESELECTED) {
                caracter = '-';
            }

            choices.setCharAt(index, caracter);
            setupPicture();
        }
    }

}
