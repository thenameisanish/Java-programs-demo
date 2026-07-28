import javax.swing.*;
import java.awt.event.*;

public class SICalc extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b;

    SICalc()
    {
        setTitle("SI Calculator");
        setSize(400,400);
        setLayout(null);

        l1 = new JLabel("Principal");
        l1.setBounds(50,50,100,30);

        t1 = new JTextField();
        t1.setBounds(160,50,100,30);


        l2 = new JLabel("Time");
        l2.setBounds(50,100,100,30);

        t2 = new JTextField();
        t2.setBounds(160,100,100,30);


        l3 = new JLabel("Rate");
        l3.setBounds(50,150,100,30);

        t3 = new JTextField();
        t3.setBounds(160,150,100,30);


        l4 = new JLabel("Simple Interest");
        l4.setBounds(50,200,100,30);

        t4 = new JTextField();
        t4.setBounds(160,200,100,30);
        t4.setEditable(false);


        l5 = new JLabel("Total Amount");
        l5.setBounds(50,240,100,30);

        t5 = new JTextField();
        t5.setBounds(160,240,100,30);
        t5.setEditable(false);


        b = new JButton("Calculate");
        b.setBounds(100,290,150,30);


        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(l5); add(t5);
        add(b);


        b.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
        float p = Float.parseFloat(t1.getText());
        float t = Float.parseFloat(t2.getText());
        float r = Float.parseFloat(t3.getText());

        float si = (p*t*r)/100;
        float amount = p + si;

        t4.setText(""+si);
        t5.setText(""+amount);
    }


    public static void main(String args[])
    {
        new SICalc();
    }
}