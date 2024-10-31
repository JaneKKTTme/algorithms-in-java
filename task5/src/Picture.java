import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Picture extends JFrame
{
    JButton b1;
    JLabel l1;

    public Picture()
    {
        setTitle("Background Color for JFrame");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        l1 = new JLabel("Take me full adress of picture: ");
        JTextField f1 = new JTextField(30);
        JButton b1 = new JButton("Enter");
        setLayout(new FlowLayout());
        add(l1);
        add(f1);
        add(b1);
        b1.addActionListener(new ActionListener() { 
        	public void actionPerformed(ActionEvent ae) {
        		try {
        			setContentPane(new JLabel(new ImageIcon(f1.getText())));
        		} 
        		catch(Exception e) {
        			JOptionPane.showMessageDialog(null, "Error!","alert" , JOptionPane.ERROR_MESSAGE);
        		}//FIND ANOTHER WAY
        	}
        });
        setSize(998, 998);
        setSize(1000, 1000);
    }

    public static void main(String args[])
    {
        new Picture();
    }
} 