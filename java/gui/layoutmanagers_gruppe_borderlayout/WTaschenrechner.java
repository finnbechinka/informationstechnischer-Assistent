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
	private JPanel secPanel = new JPanel(new GridLayout(2, 1));
	private JPanel thirdPanel = new JPanel(new GridLayout(4, 1));
	private JButton bPlus = new JButton("+");
	private JButton bMinus = new JButton("-");
	private JButton bDivide = new JButton("/");
	private JButton bMultiply = new JButton("*");
	private JLabel lidk = new JLabel("this is a placeholder lol fuck off");
	private JLabel lResult = new JLabel("this is a placeholder also wtf");
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
		mainPanel.add(lResult, BorderLayout.SOUTH);

		mainPanel.add(secPanel, BorderLayout.CENTER);
		secPanel.add(tfInput1);
		tfInput1.setColumns(25);
		secPanel.add(tfInput2);
		tfInput2.setColumns(25);

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

	private class bPlusListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bPlus pressed.");
			if (!tfInput1.getText().isEmpty() && !tfInput2.getText().isEmpty()) {
				double x = Double.parseDouble(tfInput1.getText());
				double y = Double.parseDouble(tfInput2.getText());

				double result = x + y;

				lResult.setText(Double.toString(result));
			}
		}
	}

	private class bMinusListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bMinus pressed.");
			if (!tfInput1.getText().isEmpty() && !tfInput2.getText().isEmpty()) {
				double x = Double.parseDouble(tfInput1.getText());
				double y = Double.parseDouble(tfInput2.getText());

				double result = x - y;

				lResult.setText(Double.toString(result));
			}
		}
	}

	private class bDivideListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bDivide pressed.");
			if (!tfInput1.getText().isEmpty() && !tfInput2.getText().isEmpty()) {
				double x = Double.parseDouble(tfInput1.getText());
				double y = Double.parseDouble(tfInput2.getText());

				if (y == 0) {
					lResult.setText("oi cunt, you cant divide by 0");
				} else {

					double result = x / y;

					lResult.setText(Double.toString(result));
				}
			}
		}
	}

	private class bMultiplyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bMultiply pressed.");
			if (!tfInput1.getText().isEmpty() && !tfInput2.getText().isEmpty()) {
				double x = Double.parseDouble(tfInput1.getText());
				double y = Double.parseDouble(tfInput2.getText());

				double result = x * y;

				lResult.setText(Double.toString(result));
			}
		}
	}
}
