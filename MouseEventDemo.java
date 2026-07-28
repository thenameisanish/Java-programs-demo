import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame implements MouseListener
{
    JLabel l;

    MouseEventDemo()
    {
        l = new JLabel("Perform Mouse Action");
        l.setBounds(80,100,200,30);

        add(l);

        addMouseListener(this);

        setTitle("Mouse Listener Demo");
        setSize(300,250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked");
    }


    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse Pressed");
    }


    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse Released");
    }


    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse Entered");
    }


    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exited");
    }


    public static void main(String args[])
    {
        new MouseEventDemo();
    }
}