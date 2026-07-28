import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Addition extends JFrame implements ActionListener
{
    JTextField t1, t2;
    JButton b;
    JLabel result;

    Addition()
    {
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        b = new JButton("Add");
        result = new JLabel("Result");

        add(new JLabel("Number 1"));
        add(t1);

        add(new JLabel("Number 2"));
        add(t2);

        add(b);
        add(result);

        b.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(250,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        result.setText("Sum = " + (a+b));
    }

    public static void main(String args[])
    {
        new Addition();
    }
}