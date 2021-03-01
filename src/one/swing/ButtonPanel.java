package one.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class ButtonPanel extends JPanel {
    private JButton leftButton;
    private JButton middleButton;
    private JButton rightButton;

    public ButtonPanel(){
        VictimCodeAcitionListener acitionListener = new VictimCodeAcitionListener();
        ImageIcon leftImageIcon = createImageIcon("download");

        this.leftButton = new JButton("Disable middle button", leftImageIcon);
        this.leftButton.setActionCommand("disable");
        this.leftButton.addActionListener(acitionListener);
        this.leftButton.setHorizontalTextPosition(SwingConstants.LEFT);
        this.leftButton.setMnemonic(KeyEvent.VK_L);

        this.middleButton = new JButton("Middle button", leftImageIcon);
        this.middleButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        this.middleButton.setHorizontalTextPosition(SwingConstants.CENTER);

        this.rightButton = new JButton("Enable middle button", leftImageIcon);
        this.rightButton.setActionCommand("enable");
        this.rightButton.addActionListener(acitionListener);
        this.rightButton.setHorizontalTextPosition(SwingConstants.RIGHT);
        this.rightButton.setMnemonic(KeyEvent.VK_R);

        add(leftButton);
        add(middleButton);
        add(rightButton);
    }

    private ImageIcon createImageIcon(String pictureName){
        Class buttonPanelClass = ButtonPanel.class;
        String imageName = pictureName.endsWith(".gif")? pictureName:pictureName+".gif";
        URL imgUel = buttonPanelClass.getResource(imageName);
        ImageIcon imageIcon = new ImageIcon(imgUel);
        return imageIcon;
    }

    class VictimCodeAcitionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if("disable".equals(e.getActionCommand())){
                middleButton.setEnabled(false);
            }else{
                middleButton.setEnabled(true);
            }
        }
    }
}
