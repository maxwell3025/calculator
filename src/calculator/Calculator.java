package calculator;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextField;

public class Calculator extends Frame implements ActionListener, WindowListener {
	Label answer;
	JTextField num1;
	JTextField num2;

	Calculator(String s) {
		super(s);
		setSize(2500, 720);
		setLayout(new FlowLayout());
		addWindowListener(this);
		num1 = new JTextField(32);

		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("The entered text is: " + num1.getText());
			}
		});

		num1.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent event) {
				// System.out.println("You typed in: " + num1.getText());
			}

			public void keyReleased(KeyEvent event) {
				String x = "";
				if (!(x.equals(num2.getText()) || x.equals(num1.getText()))) {
					int b = (Integer.parseInt(num1.getText()) + Integer
							.parseInt(num2.getText()));
					answer.setText("The sum of " + num1.getText() + " and "
							+ num2.getText() + " is " + b);
				}
			}

			public void keyPressed(KeyEvent event) {
				// System.out.println("key pressed");
			}
		});

		add(num1);
		num2 = new JTextField(32);
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("The entered text is: " + num1.getText());
			}
		});

		num2.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent event) {
				//System.out.println("You typed in: " + num1.getText());
				System.out.println(""+event.getKeyChar());
			}

			public void keyReleased(KeyEvent event) {
				String x = "";
				if (!(x.equals(num2.getText()) || x.equals(num1.getText()))) {
					int a = (Integer.parseInt(num1.getText()) + Integer
							.parseInt(num2.getText()));
					answer.setText("The sum of " + num1.getText() + " and "
							+ num2.getText() + " is " + a);
				}
			}

			public void keyPressed(KeyEvent event) {
				
				
			}
		});
		add(num2);
		answer = new Label(
				"                                                                                                                      ");
		answer.setFont(new Font("font", 20, 20));
		add(answer);
		setVisible(true);
	}

	public void windowOpened(WindowEvent event) {
	}

	public void windowClosing(WindowEvent event) {
		System.exit(0);
	}

	public void windowClosed(WindowEvent event) {
	}

	public void windowIconified(WindowEvent event) {
	}

	public void windowDeiconified(WindowEvent event) {
	}

	public void windowActivated(WindowEvent event) {
	}

	public void windowDeactivated(WindowEvent event) {

	}

	public void actionPerformed(ActionEvent event) {
		int a = Integer.parseInt(num1.getText())
				+ Integer.parseInt(num2.getText());
		answer.setText("hello");
	}

	public static void main(String[] args) {

		new Calculator("your very own calculator ◕‿◕");
	}

}
