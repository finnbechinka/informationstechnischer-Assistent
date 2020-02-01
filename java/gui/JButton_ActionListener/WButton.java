package JButton_ActionListener;

import java.awt.event.*;

import javax.swing.*;

public class WButton extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1482560891275377584L;
	private JPanel p = new JPanel();
	private JButton b = new JButton("DONT DO IT BRO");
	
	public WButton(){
		super("WButton");
		this.setSize(400,400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		exec();
		this.setVisible(true);
	}
	
	private void exec(){
		this.add(p);
		p.add(b);
		b.addActionListener(new Listener());
	}
	
	private class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			dispose();
		}
	}
}
