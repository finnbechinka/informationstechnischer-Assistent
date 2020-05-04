package program;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class WLogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8490898894981369448L;
	
	private JPanel mainPanel = new JPanel(new GridLayout(4,2));
	private JLabel lUsername = new JLabel("Username:");
	private JLabel lPassword = new JLabel("Password:");
	private JLabel lIp = new JLabel("IP:");
	private JTextField tfUsername = new JTextField();
	private JPasswordField tfPassword = new JPasswordField();
	private JTextField tfIp = new JTextField();
	private JButton bLogin = new JButton("Login");
	
	public WLogin(){
		super("Database-Login");
		this.setSize(300,150);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		init();
		this.setVisible(true);
	}
	
	private void init(){
		this.add(mainPanel);
		mainPanel.add(lIp);
		mainPanel.add(tfIp);
		mainPanel.add(lUsername);
		mainPanel.add(tfUsername);
		mainPanel.add(lPassword);
		mainPanel.add(tfPassword);
		mainPanel.add(new JPanel());
		mainPanel.add(bLogin);
		bLogin.addActionListener(new LoginListener());
	}
	
	private class LoginListener implements ActionListener{
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e){
			System.out.println("WLogin: bLogin pressed.");
			new WVerwaltung(new DataAccess(tfUsername.getText(), tfPassword.getText(), tfIp.getText()));
			dispose();
		}
	}
}