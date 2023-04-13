package Session09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener , WindowListener, MouseListener, MouseMotionListener {

    public static void main(String[] args) {
        new MainFrame();
//        ngomongin tentang listener

    }
    private JButton btn = new JButton("click me!");
    //    action listener=> event yang basic, button bunya action kan di klik. itu masuk ke basic nya.
    private JButton btn2 = new JButton("South!");
    private JButton btn3 = new JButton("North!");

    private int count = 0;


    private ActionListener actionBtn3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { //anonymus Class
//            interface gaboleh dibikin objek =, maka ini sering kita sebut anonymus class
            //kita ngepaksa nurunin dulu baru pake
            count++;
            btn3.setText("Nort "+count);

        }
    };


    public MainFrame(){//INIII WAJIB YAA ANDREAAAS SYGGGGGGG
        btn.addActionListener(this); //kalo di klik ke action performed
        btn2.addActionListener(this);//sama behaviour dengan yang atas.
        btn3.addActionListener(actionBtn3);
        add(btn);
        add(btn2, BorderLayout.SOUTH);
        add(btn3,BorderLayout.NORTH);

        btn.addMouseMotionListener(this);
        addWindowListener(this);
        //event listener yang bisa kita tambahin


        setSize(400,400);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //informasi lengkap nya gimana gimana gitu.
        System.out.println("Clicked");
        if(e.getSource() == btn){
            //getsorce itu siapa yang diencet, misal button di clik berati source dari buttin
            JOptionPane.showMessageDialog(this,"Alen jelek!"); //show inpiut dialog
            String name = JOptionPane.showInputDialog("Masukan nama: ");
            System.out.println("Your Name is: "+ name);
            //bisa dibilang popup  si Joption pane
            int result = JOptionPane.showConfirmDialog(this, "Yakin gak luwh?");
            System.out.println("Button: " + result);
            //kalo ada button delete sebaiknya ada confirm dialog dulu ya
        } else if (e.getSource() == btn2) {
            JOptionPane.showMessageDialog(null, "Ini Footer");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("X: "+ e.getX() +" ,Y:" +e.getY());
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Openned!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing!");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed!");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Conifed!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified!");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated!");
    }
}

/*CATATANN
beberapa komponen bisa jadi 1 action listener
bisa juga kalo cm 1 component 1 action listener, tapi cape kalo 1 componen 1 action listener mulu
sesuaikan dengan kebutuhan kalian ya.

kalo this itu jFrame, ditengah dari JFrame nya. Tengah JFrame nya
kalo parentnya null maka dia akan mengreefer ke layar kita.

===============================
kalo debug mau mencari tau
===============================
Overdefined=>

Mouse motion pas di hover dkk, pas window pas di minimize di tutup,
Mouse Listener
*/
