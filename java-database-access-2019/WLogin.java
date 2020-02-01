package jda;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class WLogin extends JFrame{
	private JButton bConnect = new JButton("Connect");
	private JLabel lIP = new JLabel("Database IP:Port:");
	private JLabel lUserName = new JLabel("Username:");
	private JLabel lPassword = new JLabel("Password");
	private JTextField tfIP = new JTextField();
	private JTextField tfUserName = new JTextField();
	private JPasswordField pfPassword = new JPasswordField();
	private JLabel lPlaceHolder = new JLabel("");
	
	private String ip = null;
	private String username = null;
	private String password = null;
	
	public WLogin() {
		this.setTitle("Login Window");
		this.setVisible(true);
		this.setSize(300, 150);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	
	private void init() {
		setLayout(new GridLayout(4,2));
		add(lIP);
		add(tfIP);
		this.tfIP.setToolTipText("If left emtpy set to localhost:3306");
		add(lUserName);
		add(tfUserName);
		add(lPassword);
		add(pfPassword);
		add(lPlaceHolder);
		add(bConnect);
		bConnect.addActionListener(new Listener());
		tfUserName.addActionListener(new Listener());
		pfPassword.addActionListener(new Listener());
	}
	
	public void setTextFieldContents(String url, String username, String password){
		this.tfIP.setText(url);						
		this.tfUserName.setText(username);
		this.pfPassword.setText(password);
	}
	
	public class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(tfIP.getText().equals("")) {
				ip = "localhost:3306";
			}else {
				ip = tfIP.getText();
			}
			
			if(tfUserName.getText().equals("")) {
				@SuppressWarnings("unused")
				WErrorPopup EP = new WErrorPopup("You have to enter a username!", "");
			}else {
				username = tfUserName.getText();
				password = String.valueOf(pfPassword.getPassword());
				
				try {
					@SuppressWarnings("unused")
					WDaten wd = new WDaten(ip, username, password);
				} catch (Exception e1) {System.out.println(e1);}
				dispose();
			}

		}
		
	}
}
