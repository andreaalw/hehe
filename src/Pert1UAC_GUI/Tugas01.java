package Pert1UAC_GUI;

import javax.swing.*;
import java.awt.*;

public class Tugas01 extends JFrame{
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

    public Tugas01(){
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(headerLabel, BorderLayout.NORTH);


        CenterPanel.add(emailLabel);
        CenterPanel.add(email);
        CenterPanel.add(passLabel);
        CenterPanel.add(passwordField);


        footerPanel.add(submitBtn);
        add(footerPanel,BorderLayout.SOUTH);


        setSize(300,200);
        setDefaultCloseOperation(3);//3 artinya exitonClose
        setVisible(true);

    }



//        JFrame frame = new JFrame("LOGIN");
//
//
//
//        JPanel panel = new JPanel();
//
//        JLabel label = new JLabel("LOGIN");
//        frame.add(label,BorderLayout.NORTH);
//
//        JTextField textField = new JTextField();
//
//        JButton btn = new JButton("Submit");
//        frame.add(btn, BorderLayout.SOUTH);
//
//        frame.setSize(300,200);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);
}

