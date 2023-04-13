package Session12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Main extends JFrame implements ActionListener {
    private JLabel display = new JLabel("0");
    private String[] btnLabels = new String[]{

            "AC","x2","%","+",
            "7","8","9","-",
            "4","5","6","x",
            "1","2","3","/",
            "0",".","+-","=",
    };
    private JPanel panel = new JPanel(new GridLayout(5,4));
    private HashMap<String, Operation> operationHashMap = new HashMap<>();
    public Main(){
        operationHashMap.put("+", new OperationBinary() {
            @Override
            public Double doOperation(Double a, Double b) {
                return a+b;
            }
        });

        operationHashMap.put("-", (OperationBinary)(a,b)->a-b);
        operationHashMap.put("x2", (OperationUnary)(a)->a*a);
        operationHashMap.put("+-", (OperationUnary)(a)->-a);
        operationHashMap.put("x", (OperationBinary)(a,b)->a*b);
        operationHashMap.put("%", (OperationUnary)(a)->a/100);



        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        add(display,BorderLayout.NORTH);
        add(panel); // kalo mau di tengah, gausah kasi apapun

        Font fontbtn = new Font("Arial", Font.PLAIN, 20);
        for (String l: btnLabels){
            JButton btn = new JButton(l);
            btn.setFont(fontbtn);
            btn.addActionListener(this);
            panel.add(btn);
        }


        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(300,400);
    }
    public static void main(String[] args) {
        new Main();
    }
    private OperationBinary pendingOperation = null;
    private Double oldValue= 0.0;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()instanceof JButton btn) {
            String Label = btn.getText();
            if(Label.equals("AC")){
                display.setText("0");
                pendingOperation = null;
                oldValue = 0.0;
            }
            if ( Character.isDigit(Label.charAt(0))){
                setDisplay(display.getText() + Label);
            } else if (Label.equals(".") && !display.getText().contains(".")) {
                setDisplay(display.getText() + Label);
            }else{
                Operation op = operationHashMap.get(Label);
                Double value = Double.parseDouble(display.getText());
                Double result =0.0;
                if (op instanceof OperationUnary una){
                    result = una.doOperation(value);
                }else if(op instanceof OperationBinary bin){
                    pendingOperation = bin;
                    oldValue = value;
                }else if(Label.equals("=") && pendingOperation != null){
                    result = pendingOperation.doOperation(oldValue,value);
                }
                setDisplay(result == 0.0 ? "0" :result.toString());
            }
        }
    }
    void setDisplay(String str){
        if(str.length() >=2 && str.charAt(0) == '0' && str.charAt(1) != '.'){
            str = str.substring(1);
        }
        display.setText(str);
    }
}

interface Operation{

}

interface OperationUnary extends Operation{
    Double doOperation(Double a);
}

interface OperationBinary extends Operation{
    Double doOperation(Double a, Double b);

}





