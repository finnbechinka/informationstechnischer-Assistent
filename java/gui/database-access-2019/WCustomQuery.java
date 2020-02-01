package jda;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class WCustomQuery extends JFrame{
	private JLabel lLabel = new JLabel("Enter your custom query:");
	private JTextField tfQuery = new JTextField();
	private JButton bOK = new JButton("OK");
	
	public WCustomQuery(){
		this.setTitle("Custom query");
		this.setVisible(true);
		this.setSize(300, 150);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		init();
	}
	
	private void init(){
		this.getContentPane().add(lLabel, BorderLayout.NORTH);
		this.getContentPane().add(tfQuery, BorderLayout.CENTER);
		this.getContentPane().add(bOK, BorderLayout.SOUTH);
		this.bOK.addActionListener(new Listener());
	}
	
	private class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String input = tfQuery.getText();
			String inputFirstWord = input.substring(0, input.indexOf(" "));
			
			switch(inputFirstWord){
				case "SELECT":
				case "select":
					WDaten.execCustomSelect(input);
					break;
				case "USE":
				case "use":
					WDaten.useCustomDb(input);
					break;
				default:					
					@SuppressWarnings("unused")
					WErrorPopup ep = new WErrorPopup("Only SELECT query allowed. (and use)", "");
			}
			
		}
	}

}
