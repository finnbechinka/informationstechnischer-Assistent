package JMenuBar_JMenu;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class WMenus extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7531836678256242787L;
	
	private JPanel p = new JPanel();
	private JMenuBar mb = new JMenuBar();
	private JMenu m1 = new JMenu("menu");
	private JMenu m2 = new JMenu("menu2");
	private JMenuItem mi1 = new JMenuItem("hi");
	private JMenuItem mi2 = new JMenuItem("bye");
	
	public WMenus(){
		super("WMenus");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		exec();
		this.setVisible(true);
	}
	
	private void exec(){
		this.add(p);
		p.add(mb);
		mb.add(m1);
		mb.add(m2);
		m1.add(mi1);
		m1.add(mi2);
		mi1.addActionListener(new Listener());
		mi2.addActionListener(new Listener());
	}
	
	private class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		if(e.getSource() == mi1){
			p.setBackground(Color.pink);
		}else if(e.getSource() == mi2){
			dispose();
		}
		}
	}
}
