package JTextField_JLabel;

import javax.swing.*;

public class WTextField extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8913952409514857846L;
	
	private JPanel p = new JPanel();
	private JTextField tf= new JTextField();
	
	public WTextField(){
		this.setTitle("WTextField");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		exec();
		this.setVisible(true);
	}
	
	private void exec(){
		this.add(p);
		p.add(tf);
		tf.setColumns(20);
	}
}
