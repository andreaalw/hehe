package ProjectAkhir_Perpustakaan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.concurrent.locks.StampedLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Page daftar buku yang blm kedaftar
 * Ini page buat Admin yaa!!
 */

public class bookRegistrationPage extends JFrame implements ActionListener {
    private JLabel headerLabel = new JLabel("Book Registration");
    private JPanel CentralPanel = new JPanel(new GridLayout(3,2));
    private JLabel BookCLabel = new JLabel("Book Code[HAEXXX]");
    private JLabel BookNLabel = new JLabel("Book Name");
    private JLabel ValidationText = new JLabel(); // NYOBA!

    private JTextField BookCode = new JTextField();
    private JTextField BookName = new JTextField();
    private JPanel footerPanel = new JPanel();
    private JButton SubmitButton = new JButton("Submit");



    public bookRegistrationPage(){

        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(headerLabel,BorderLayout.NORTH);

        CentralPanel.add(BookCLabel);
        CentralPanel.add(BookCode);

        CentralPanel.add(BookNLabel);
        CentralPanel.add(BookName);

        CentralPanel.add(ValidationText);

        add(CentralPanel);

        footerPanel.add(SubmitButton);
        add(footerPanel,BorderLayout.SOUTH);

        SubmitButton.addActionListener(this);


        setSize(400,190);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SubmitButton){
            String bookCode = BookCode.getText();

            String bookName = BookName.getText();

            Pattern pattern = Pattern.compile("^HAE\\d{3}$");
            Matcher matcher = pattern.matcher(bookCode);

            user = getAuthenticatedUser(bookCode,bookName);

            if (matcher.matches() || user != null) {
                JOptionPane.showMessageDialog(this, "Input Succesfull", "Validasi Input", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Book Code: " + bookCode);
                System.out.println("Book Name: "+bookName);
            } else {
                JOptionPane.showMessageDialog(this, "please enter the book code according to the command", "Validasi Input", JOptionPane.ERROR_MESSAGE);
            }




        }
    }
    public User user;
    private User getAuthenticatedUser(String bookCode, String bookName) {
        User user = null;

        final String url = "jdbc:mysql://localhost/databuku?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection connection = DriverManager.getConnection(url,USERNAME,PASSWORD);

            Statement stat = connection.createStatement();
            String sql = "INSERT INTO bookList(BookCode,BookName) VALUES (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,bookCode);
            preparedStatement.setString(2,bookName);

            int resultSet = preparedStatement.executeUpdate(sql);

        } catch(Exception e){
            e.printStackTrace();
        }

        return user;
    }

    public static void main(String[] args) {
        bookRegistrationPage bookregistrationPage = new bookRegistrationPage();
        User user = bookregistrationPage.user;
        if (user != null){
            System.out.println("Succes");
        }
        else {
            System.out.println("Gagal");
        }
    }


}
