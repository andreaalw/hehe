package Andreanyoba;

import javax.swing.*;

public class NyobaRegist {
    public static void main(String[] args) {
        JFrame frame = new JFrame("NyobaRegist");
        frame.setContentPane(new NyobaRegist().Registtration);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField CodeField;
    private JLabel BookCode;
    private JLabel BookName;
    private JTextField NameField;
    private JLabel HeaderName;
    private JButton submitButton;
    private JPanel Registtration;

}
