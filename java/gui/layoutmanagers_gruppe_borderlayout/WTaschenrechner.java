package layoutmanager_gruppe_borderlayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WTaschenrechner extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4795964450205399115L;

	private JPanel mainPanel = new JPanel(new BorderLayout());
	private JPanel secPanel = new JPanel(new GridLayout(3, 1));
	private JPanel thirdPanel = new JPanel(new GridLayout(4, 1));
	private JButton bPlus = new JButton("+");
	private JButton bMinus = new JButton("-");
	private JButton bDivide = new JButton("/");
	private JButton bMultiply = new JButton("*");
	private JLabel lidk = new JLabel("this is a placeholder lol fuck off");
	private JLabel lResult = new JLabel("Result:");
	private JTextField tfInput1 = new JTextField();
	private JTextField tfInput2 = new JTextField();

	public WTaschenrechner() {
		super("poop lol");
		this.setSize(350, 150);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		init();
		this.setVisible(true);
	}

	private void init() {
		this.add(mainPanel);
		mainPanel.add(lidk, BorderLayout.NORTH);

		mainPanel.add(secPanel, BorderLayout.CENTER);
		secPanel.add(tfInput1);
		tfInput1.setColumns(25);
		secPanel.add(tfInput2);
		tfInput2.setColumns(25);
		secPanel.add(lResult);

		mainPanel.add(thirdPanel, BorderLayout.EAST);
		thirdPanel.add(bPlus);
		bPlus.addActionListener(new bPlusListener());
		thirdPanel.add(bMinus);
		bMinus.addActionListener(new bMinusListener());
		thirdPanel.add(bDivide);
		bDivide.addActionListener(new bDivideListener());
		thirdPanel.add(bMultiply);
		bMultiply.addActionListener(new bMultiplyListener());
	}

	private String calculate(String operator) {
		String sResult = "something went wrong. check your input.";
		boolean num = false;

		if (tfInput1.getText().matches("[0-9]+")
				&& tfInput2.getText().matches("[0-9]+")) {
			num = true;
			System.out.println("input = number");
		}

		if (num) {
			double x = Double.parseDouble(tfInput1.getText());
			double y = Double.parseDouble(tfInput2.getText());
			double result = 0;
			if (operator == "+") {
				result = x + y;
			} else if (operator == "-") {
				result = x - y;
			} else if (operator == "/") {
				if (y == 0) {
					return "oi cunt, you cant divide by 0";
				} else {
					result = x / y;
				}
			} else if (operator == "*") {
				result = x * y;
			}
			sResult = Double.toString(result);
			System.out.println(x + operator + y + ": " + result);
		}

		return sResult;
	}

	private class bPlusListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bPlus pressed.");
			lResult.setText("Result: " + calculate("+"));
		}
	}

	private class bMinusListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bMinus pressed.");
			lResult.setText("Result: " + calculate("-"));
		}
	}

	private class bDivideListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bDivide pressed.");
			lResult.setText("Result: " + calculate("/"));
		}
	}

	private class bMultiplyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bMultiply pressed.");
			lResult.setText("Result: " + calculate("*"));
		}
	}
}
