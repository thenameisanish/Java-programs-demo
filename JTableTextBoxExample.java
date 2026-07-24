import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class JTableTextBoxExample extends JFrame implements ActionListener {

    JTextField txtId, txtName, txtAge;
    JButton btnAdd;
    JTable table;
    DefaultTableModel model;

    JTableTextBoxExample() {

        setLayout(new FlowLayout());

        add(new JLabel("ID:"));
        txtId = new JTextField(10);
        add(txtId);

        add(new JLabel("Name:"));
        txtName = new JTextField(10);
        add(txtName);

        add(new JLabel("Age:"));
        txtAge = new JTextField(10);
        add(txtAge);

        btnAdd = new JButton("Add");
        btnAdd.addActionListener(this);
        add(btnAdd);

        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Age");

        table = new JTable(model);
        add(new JScrollPane(table));

        setTitle("JTable with TextFields");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    if(txtId.getText().isEmpty() || txtName.getText().isEmpty() || txtAge.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Please fill all fields");
        return;
    }

    model.addRow(new Object[]{
        txtId.getText(),
        txtName.getText(),
        txtAge.getText()
    });

    // Clear text fields
    txtId.setText("");
    txtName.setText("");
    txtAge.setText("");
}
    public static void main(String[] args) {
        new JTableTextBoxExample();
    }
}