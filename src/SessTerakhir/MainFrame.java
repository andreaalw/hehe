package SessTerakhir;

import Session12.Main;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends BaseFrame {
    MainFrame(){
        add(new MyButton("Btn1"));

        setSize(400,400);
        setDefaultCloseOperation(3);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainFrame();
//        new BaseFrame();
    }


}

class MyButton extends JButton{
    public MyButton(String text){
        super(text);
        setBackground(Color.RED);
        setFont(new Font("Arial", Font.PLAIN,40));
    }
}

class BaseFrame extends JFrame{

    private JLabel header = new JLabel("Andrea Cantik"); //kalo mau anaknnya bisa apply pake setter getter y a
    BaseFrame(){
        add(header, BorderLayout.NORTH);
        setSize(400,400);
        setDefaultCloseOperation(3);
        setVisible(true);
    }


}
