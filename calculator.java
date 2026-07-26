import javax.swing.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    calculator() {
        setTitle("Calculator");
        setSize(400, 400);
        setLayout(null);

        // First number
        l1 = new JLabel("Enter first number");
        l1.setBounds(30, 20, 150, 30);
        t1 = new JTextField();
        t1.setBounds(180, 20, 100, 30);

        // Second number
        l2 = new JLabel("Enter second number");
        l2.setBounds(30, 60, 150, 30);
        t2 = new JTextField();
        t2.setBounds(180, 60, 100, 30);

        // Result
        l3 = new JLabel("Result");
        l3.setBounds(30, 100, 150, 30);
        t3 = new JTextField();
        t3.setBounds(180, 100, 100, 30);
        t3.setEditable(false);

        // Buttons
        add = new JButton("ADD");
        add.setBounds(30, 150, 80, 40);
        sub = new JButton("Subtract");
        sub.setBounds(120, 150, 80, 40);
        mul = new JButton("Multiply");
        mul.setBounds(210, 150, 90, 40);
        div = new JButton("Divide");
        div.setBounds(30, 200, 80, 40);

        // Registering buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Adding components into frame
        add(l1); add(l2); add(l3);
        add(t1); add(t2); add(t3);
        add(add); add(sub); add(mul); add(div);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == add) {
                result = a + b;
            } else if (e.getSource() == sub) {
                result = a - b;
            } else if (e.getSource() == mul) {
                result = a * b;
            } else if (e.getSource() == div) {
                if (b == 0) {
                    t3.setText("Cannot divide by Zero");
                    return;
                }
                result = a / b;
            }

            t3.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            t3.setText("Enter valid no");
        }
    }

    public static void main(String[] args) {
        new calculator();
    }
}