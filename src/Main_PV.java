//	Main_PV.java by Kyle Wolff and Brandon VanderMey on 3/9/2015

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Main_PV extends JApplet implements ActionListener
{
	JTextField txtPassword = new JTextField(10);
	JLabel lblPassword = new JLabel("Password:");
	JLabel lblMessage = new JLabel();
	JButton btnSubmit = new JButton("Submit");
	
	public void init()
	{
		setLayout(null);
		add(txtPassword);
		add(lblPassword);
		add(btnSubmit);
		
		
		txtPassword.setBounds(new Rectangle(new Point(120, 20), txtPassword.getPreferredSize()));
		lblPassword.setBounds(new Rectangle(new Point(50, 20), lblPassword.getPreferredSize()));
		btnSubmit.setBounds(new Rectangle(new Point(65, 45), btnSubmit.getPreferredSize()));
		btnSubmit.addActionListener(this);
		setSize(250, 175);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (txtPassword.getText().equals("java"))
		{
			JOptionPane.showMessageDialog(null, "Password is valid");
		}
	}
}
