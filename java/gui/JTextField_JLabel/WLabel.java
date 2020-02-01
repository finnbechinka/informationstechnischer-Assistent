package JTextField_JLabel;

import javax.swing.*;

public class WLabel extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7156147695208097100L;
	
	private JPanel p = new JPanel();
	private JLabel l = new JLabel();
	
	public WLabel(){
		this.setTitle("WLabel");
		this.setSize(400,400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		exec();
		this.setVisible(true);
	}

	private void exec(){
		this.add(p);
		p.add(l);
		l.setText("WOW");
	}
}
