package Session10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class mainFrame extends JFrame implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
    JMenuItem loginMenuItem = new JMenuItem("Login");
    JDesktopPane desktopPane = new JDesktopPane();

    public mainFrame(){
        menuBar.add(fileMenu);
        fileMenu.add(loginMenuItem);

        fileMenu.add(new JMenuItem("logout"));
        //pisahin dengan garis
        String menu[]= {"Copy", "Paste"};
        for (String item :menu) {
            JMenuItem menuItem = new JMenuItem((item));
            menuItem.addActionListener((this));
            fileMenu.add(menuItem);
        }
//        fileMenu.add(new JSeparator()); //ada cara yang lebih mudah
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        //pas dia login pindah frame
        loginMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        //kalo misal kita klik tanda silang langsung close
        setJMenuBar(menuBar);
        //gabisa menubar doang ya!

        setContentPane(desktopPane); //warnanya beda

        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }


    public static void main(String[] args) {
        new mainFrame();
    }

    JInternalFrame frame = null;//pertama kali pasti null

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitMenuItem){
            //source nya sama ga sama exit menu item
            //kalo sama bisa matiin close
//            dispose(); //dispose doang bisa jadi ada yang gak ke clos e

            System.exit(0); //kalo exit(0) pasti ke close semua
            //beda si dispose sama exit.
            //inget default close operation kita
            //EXIT ON CLOSE

        }
        //apakah sumbernya dari JmenuItem, otomeatis dia dai jadiin variabel
        //namanya menu
        if(e.getSource() instanceof JMenuItem menu){
            if(menu.getText().equals("Login")){

//                JFrame frame = new JFrame("Login");
//                frame.setVisible(true);
//                frame.setSize(200,200);

//                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                //kalo pake exit on close jadi semua nya ke close
                //di semua fram enya

                if(frame == null || frame.isClosed()){
                    frame = new JInternalFrame("Login", true, true, true, true);
                    Vector<String> header = new Vector<>();
                    header.add("Student Id: ");
                    header.add("Student Name: ");
                    header.add("Score");

                    Vector<Vector<String>> data = new Vector<>();
                    Vector<String> row = new Vector<>();
                    row.add("12345");
                    row.add("Ronitin");
                    row.add("99");
                    data.add(row);

                    row = new Vector<>();
                    row.add("15345");
                    row.add("hhviy");
                    row.add("11");

                    data.add(row);

                    DefaultTableModel dtm = new DefaultTableModel(data, header);
                    JTable table = new JTable(dtm);
                    frame.add(table);
                    desktopPane.add(frame);
                }
                frame.setVisible(true);
                frame.setBounds(50,50,300,300);
            }
        }
    }
}
