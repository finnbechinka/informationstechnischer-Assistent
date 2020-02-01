package tictactoe;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class WGame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3806472035099024856L;

	private JPanel panel1 = new JPanel(new BorderLayout());
	private JPanel panel2 = new JPanel(new GridLayout(3, 3));
	private JMenuBar mb = new JMenuBar();
	private JMenu m1 = new JMenu("Menu");
	private JMenu m2 = new JMenu("Gamemode");
	private JMenuItem m2i1 = new JMenuItem("single player");
	private JMenuItem m2i2 = new JMenuItem("multi player");
	private JMenuItem m1i1 = new JMenuItem("new game");
	private JLabel lStatus = new JLabel("This is a Label");
	private JButton b1 = new JButton();
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();
	private JButton b4 = new JButton();
	private JButton b5 = new JButton();
	private JButton b6 = new JButton();
	private JButton b7 = new JButton();
	private JButton b8 = new JButton();
	private JButton b9 = new JButton();
	private Game g;

	public WGame() {
		super();
		this.g = new Game(this);
		this.setTitle("TicTacToe");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(400, 400);
		this.setResizable(false);
		exec();
		this.setVisible(true);
	}

	private void exec() {
		this.add(panel1);
		panel1.add(mb, BorderLayout.PAGE_START);
		panel1.add(lStatus, BorderLayout.PAGE_END);
		mb.add(m1);
		m1.add(m1i1);
		mb.add(m2);
		m2.add(m2i1);
		m2.add(m2i2);
		panel1.add(panel2, BorderLayout.CENTER);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		panel2.add(b6);
		panel2.add(b7);
		panel2.add(b8);
		panel2.add(b9);
		b1.addActionListener(new Listener());
		b2.addActionListener(new Listener());
		b3.addActionListener(new Listener());
		b4.addActionListener(new Listener());
		b5.addActionListener(new Listener());
		b6.addActionListener(new Listener());
		b7.addActionListener(new Listener());
		b8.addActionListener(new Listener());
		b9.addActionListener(new Listener());
		m1i1.addActionListener(new Listener());
		m2i1.addActionListener(new Listener());
		m2i2.addActionListener(new Listener());
	}

	public void markWinner(int a, int b, int c) {
		switch (a) {
		case 0:
			b1.setBackground(Color.GREEN);
			break;
		case 1:
			b2.setBackground(Color.GREEN);
			break;
		case 2:
			b3.setBackground(Color.GREEN);
			break;
		case 3:
			b4.setBackground(Color.GREEN);
			break;
		case 4:
			b5.setBackground(Color.GREEN);
			break;
		case 5:
			b6.setBackground(Color.GREEN);
			break;
		case 6:
			b7.setBackground(Color.GREEN);
			break;
		case 7:
			b8.setBackground(Color.GREEN);
			break;
		case 8:
			b9.setBackground(Color.GREEN);
			break;
		default:
			break;
		}

		switch (b) {
		case 0:
			b1.setBackground(Color.GREEN);
			break;
		case 1:
			b2.setBackground(Color.GREEN);
			break;
		case 2:
			b3.setBackground(Color.GREEN);
			break;
		case 3:
			b4.setBackground(Color.GREEN);
			break;
		case 4:
			b5.setBackground(Color.GREEN);
			break;
		case 5:
			b6.setBackground(Color.GREEN);
			break;
		case 6:
			b7.setBackground(Color.GREEN);
			break;
		case 7:
			b8.setBackground(Color.GREEN);
			break;
		case 8:
			b9.setBackground(Color.GREEN);
			break;
		default:
			break;
		}

		switch (c) {
		case 0:
			b1.setBackground(Color.GREEN);
			break;
		case 1:
			b2.setBackground(Color.GREEN);
			break;
		case 2:
			b3.setBackground(Color.GREEN);
			break;
		case 3:
			b4.setBackground(Color.GREEN);
			break;
		case 4:
			b5.setBackground(Color.GREEN);
			break;
		case 5:
			b6.setBackground(Color.GREEN);
			break;
		case 6:
			b7.setBackground(Color.GREEN);
			break;
		case 7:
			b8.setBackground(Color.GREEN);
			break;
		case 8:
			b9.setBackground(Color.GREEN);
			break;
		default:
			break;
		}
	}

	private void clear() {
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		b1.setBackground(null);
		b2.setBackground(null);
		b3.setBackground(null);
		b4.setBackground(null);
		b5.setBackground(null);
		b6.setBackground(null);
		b7.setBackground(null);
		b8.setBackground(null);
		b9.setBackground(null);
	}

	public void setLabel(String s) {
		this.lStatus.setText(s);
	}

	public void updateField(String player, int button) {
		switch (button) {
		case 0:
			b1.setText(player);
			break;
		case 1:
			b2.setText(player);
			break;
		case 2:
			b3.setText(player);
			break;
		case 3:
			b4.setText(player);
			break;
		case 4:
			b5.setText(player);
			break;
		case 5:
			b6.setText(player);
			break;
		case 6:
			b7.setText(player);
			break;
		case 7:
			b8.setText(player);
			break;
		case 8:
			b9.setText(player);
			break;
		}
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == m1i1) {
				clear();
				g.restartGame();
			} else if (e.getSource() == m2i1) {
				clear();
				g.setTwoPlayer(false);
				g.restartGame();
			} else if (e.getSource() == m2i2) {
				clear();
				g.setTwoPlayer(true);
				g.restartGame();
			} else if (e.getSource() == b1) {
				g.makeMove(1, false);
			} else if (e.getSource() == b2) {
				g.makeMove(2, false);
			} else if (e.getSource() == b3) {
				g.makeMove(3, false);
			} else if (e.getSource() == b4) {
				g.makeMove(4, false);
			} else if (e.getSource() == b5) {
				g.makeMove(5, false);
			} else if (e.getSource() == b6) {
				g.makeMove(6, false);
			} else if (e.getSource() == b7) {
				g.makeMove(7, false);
			} else if (e.getSource() == b8) {
				g.makeMove(8, false);
			} else if (e.getSource() == b9) {
				g.makeMove(9, false);
			}
		}
	}
}
