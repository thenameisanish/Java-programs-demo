import javax.swing.*;

 public class LoginForm extends JFrame
{
    JLabel user, pass;
    JTextField t1;
    JPasswordField t2;
    JButton b;

    LoginForm()
    {
        user = new JLabel("Username");
        pass = new JLabel("Password");

        t1 = new JTextField();
        t2 = new JPasswordField();

        b = new JButton("Login");

        user.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 150, 30);

        pass.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 150, 30);

        b.setBounds(150, 160, 100, 30);

        add(user);
        add(t1);
        add(pass); 
        add(t2);
        add(b);

        setTitle("Login Form");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new LoginForm();
    }
}
