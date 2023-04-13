package Pert1UAC_GUI;

//import jdk.internal.icu.text.UnicodeSet;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    //bikin header bagus private
    private JLabel headerLabel = new JLabel("LOGIN");
    private JPanel CenterPanel = new JPanel(new GridLayout(2,2));
    private JLabel emailLabel = new JLabel("Email: ");
    private JLabel passLabel = new JLabel("Password: ");

    //buat textbox
    private JTextField email = new JTextField();

    //biasany password pake ....
    private JPasswordField passwordField= new JPasswordField();
    private JPanel footerPanel = new JPanel();
    private JButton submitBtn   = new JButton("Submit");

    public LoginFrame(){
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(headerLabel, BorderLayout.NORTH);


        CenterPanel.add(emailLabel);
        CenterPanel.add(email);
        CenterPanel.add(passLabel);
        CenterPanel.add(passwordField);
        add(CenterPanel);

        footerPanel.add(submitBtn);
        add(footerPanel,BorderLayout.SOUTH);


        setSize(300,200);
        setDefaultCloseOperation(3);//3 artinya exitonClose
        setVisible(true);

    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
