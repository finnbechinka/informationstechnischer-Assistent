package jda;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class WErrorPopup extends JFrame{
	private JLabel lErrorMessage = new JLabel();
	private JButton bOK = new JButton("OK");
	private JPanel pPanel = new JPanel();
	
	public WErrorPopup(String em, String tt){
		this.setName("ERROR");
		this.setSize(300, 100);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.lErrorMessage.setText(em);
		this.lErrorMessage.setToolTipText(tt);
		init();
	}
	
	private void init() {
		pPanel.setLayout(new BoxLayout(pPanel, BoxLayout.Y_AXIS));
		this.getContentPane().add(pPanel);
		pPanel.add(lErrorMessage);
		this.lErrorMessage.setToolTipText(this.lErrorMessage.getText());
		pPanel.add(bOK);
		bOK.addActionListener(new Listener());
	}
	
	public class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
		
	}
	
}
