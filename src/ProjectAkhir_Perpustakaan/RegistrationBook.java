package ProjectAkhir_Perpustakaan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;

public class RegistrationBook extends JDialog{
    private JTextField CodeField;
    private JTextField NameField;
    private JButton submitButton;
    private JButton cancelButton;
    private JLabel NameLabel;
    private JPanel BookRegist;

    public RegistrationBook(JFrame parent){
        super(parent);
        setTitle("Book Registration");
        setContentPane(BookRegist);
        setMinimumSize(new Dimension(400,450));
        setModal(true);
        setLocationRelativeTo(parent);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerr();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registerr() {
        String bookCode = CodeField.getText();
        String bookName = NameField.getText();

        if(bookCode.isEmpty() || bookName.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter all fields","Try Again",JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pattern pattern = Pattern.compile("^HAE\\d{3}$");
        Matcher matcher = pattern.matcher(bookCode);


        if (matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Input Succesfull", "Validasi Input", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Book Code: " + bookCode);
            System.out.println("Book Name: "+bookName);
        } else {
            JOptionPane.showMessageDialog(this, "please enter the book code according to the command", "Validasi Input", JOptionPane.ERROR_MESSAGE);
        }

        user = addToDataBase(bookCode,bookName);

        if(user != null){
            dispose();
        }else {
            JOptionPane.showMessageDialog(this,"Faileddddd!!!","Try Again",JOptionPane.ERROR_MESSAGE);

        }

    }

    public User user;
    private User addToDataBase(String bookCode, String bookName) {
        User user = null;
        final String URL = "jdbc:mysql://localhost/databuku?serverTimezone=UTC";

        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO booklist (BookCode,BookName)"+"VALUES (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,bookCode);
            preparedStatement.setString(2,bookName);

            int addedRows = preparedStatement.executeUpdate();
            if(addedRows >0){
                user = new User();
                user.bookCode = bookCode;
                user.bookName = bookName;
            }
            statement.close();
            connection.close();


        }catch (Exception e){
            e.printStackTrace();
        }

        return user;
    }

    public static void main(String[] args) {
        RegistrationBook registrationBook = new RegistrationBook(null);

        User user = registrationBook.user;

        if(user != null){
            System.out.println("SUcesss!");
        }else {
            System.out.println("Canceled");
        }
    }
}
