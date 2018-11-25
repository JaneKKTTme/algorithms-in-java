import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GuessingGame extends JFrame {
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
	
	private int GuessingNumber;
	int Trying = 0;
	int number = 0;
	
	JTextField jf1 = new JTextField(5);
	JButton jb1 = new JButton("Enter");
	JLabel jl1 = new JLabel("You can start!");
	
	GuessingGame() {
		super("Guessing Game");
		if (RIGHT_TO_LEFT) {
            setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) {
			c.fill = GridBagConstraints.HORIZONTAL;
		}
		setSize(500, 250);
		
		if (shouldWeightX) {
			c.weightx = 20.0;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(jf1, c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 20.0;
		c.gridx = 1;
		c.gridy = 0;
		add(jb1, c);
		c.gridx = 0;
		c.gridy = 1;
		add(jl1, c);
		setGuessingNumber();
		

		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try	{
					number = newNumber();
					if (number == GuessingNumber && Trying != 3) {
						JOptionPane.showMessageDialog(null, youWin(), "END", JOptionPane.PLAIN_MESSAGE);
						System.exit(0);
					} 
					else if (number < GuessingNumber && Trying != 3) {
						mayBeMore();
						Trying++;
					} 
					else if (number > GuessingNumber && Trying != 3) {
						mayBeLess();
						Trying++;
					}
					else {
						JOptionPane.showMessageDialog(null, youLose(), "END", JOptionPane.PLAIN_MESSAGE);
						System.exit(0);
					}
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Error!", "alert" , JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		setVisible(true);
	}
	
	public int newNumber() {
		String str = jf1.getText();
		return Integer.parseInt(str);
	}
	
	public void setGuessingNumber() {
		this.GuessingNumber = (int)(Math.random() * 20);
	}
	
	public String youWin() {
		return "YOU ARE WINNER!";
	}
	
	public String youLose() {
		return "YOU ARE LOSER! You cannot guess number: " + GuessingNumber + ".";
	}
	
	public void mayBeLess() {
		jl1.setText("Number should be less. Try again.");
	}
	
	public void mayBeMore() {
		jl1.setText("Number should be more. Try again.");
	}
	
	public static void main(String[] args) {
		new GuessingGame();
	}
}
