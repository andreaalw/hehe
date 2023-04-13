package Pert1UAC_GUI;

//jangan lupa liatin import importan yang ada ya!!
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

import static javax.swing.UIManager.*;
//nanti gabisa muncul si swing kalo gapke ctrl+spc

public class Main {
    public static void main(String[] args) {
        try {
            setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {
            System.out.println(e);
        }

        JFrame frame = new JFrame("ini frame!");
        //panel biar kita bisa bikin button center 2/3/4/5/6/ dan seterusnya
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(4,3));//ini nyambung sama si for button

        JButton btn = new JButton("Click Me!");
        panel.add(btn); //add button, blm set posisi ya !!
        JButton btn1 = new JButton("Click Me!");
        panel.add(btn1);

        for (int i = 0; i < 10; i++) {
            //button nya ada 0-9
            //kalo ini flow ngikutin si for sebelum ada setLayout
            panel.add(new JButton("Button"+i));
        }
        frame.add(panel);

        JLabel lbl = new JLabel("ini Label");
        frame.add(lbl, BorderLayout.NORTH);

        //TextField untuk masukin text/Scanf/INput
        JTextField textField = new JTextField();
        frame.add(textField,BorderLayout.SOUTH);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //ketika di ake close, dia beneran ke close
        //si exit on close juga bisa diganti jadi "3" soalnya kalo kita hovering itu sma, value nya 3.
        //sifatnya constant ya.
        frame.setVisible(true);
        //memastikan kalo dia tampil/mucuul

    }
}
//kalo frame nya ga kita set dulu nanti otomatis di Center ya
//tidak bisa dimasukan 2 component. gabisa masuk north north. HARUS ADA CONTAINER
//border layout maximal 5. tapiiii
//ganti timaaaaa bisaaa