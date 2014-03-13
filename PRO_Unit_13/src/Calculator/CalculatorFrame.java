package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField Result;
	private int resultado;
	private int numero = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Result = new JTextField();
		Result.setBounds(28, 12, 408, 98);
		contentPane.add(Result);
		Result.setColumns(10);

		final JButton btnNumber7 = new JButton("7");
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Result.setText(Result.getText().concat("7"));

			}
		});
		btnNumber7.setBounds(97, 122, 55, 25);
		contentPane.add(btnNumber7);

		final JButton btnNumber8 = new JButton("8");
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Result.setText(Result.getText().concat("8"));

			}
		});
		btnNumber8.setBounds(164, 122, 55, 25);
		contentPane.add(btnNumber8);

		final JButton btnNumber9 = new JButton("9");
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText().concat("9"));

			}
		});
		btnNumber9.setBounds(231, 122, 55, 25);
		contentPane.add(btnNumber9);

		JButton btnAction_plus = new JButton("+");
		btnAction_plus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Result.setText(Result.getText() + "+");

			}
		});
		btnAction_plus.setBounds(298, 122, 55, 25);
		contentPane.add(btnAction_plus);

		final JButton btnNumber4 = new JButton("4");
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText().concat("4"));
			}
		});
		btnNumber4.setBounds(97, 159, 55, 25);
		contentPane.add(btnNumber4);

		final JButton btnNumber5 = new JButton("5");
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText().concat("5"));
			}
		});
		btnNumber5.setBounds(164, 159, 55, 25);
		contentPane.add(btnNumber5);

		final JButton btnNumber6 = new JButton("6");
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText().concat("6"));
			}
		});
		btnNumber6.setBounds(231, 159, 55, 25);
		contentPane.add(btnNumber6);

		JButton btnAction_Minus = new JButton("-");
		btnAction_Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText() + "-");
			}
		});
		btnAction_Minus.setBounds(298, 159, 55, 25);
		contentPane.add(btnAction_Minus);

		final JButton btnNumber1 = new JButton("1");
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText().concat("1"));
			}
		});
		btnNumber1.setBounds(97, 196, 55, 25);
		contentPane.add(btnNumber1);

		final JButton btnNumber2 = new JButton("2");
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText().concat("2"));

			}
		});
		btnNumber2.setBounds(164, 196, 55, 25);
		contentPane.add(btnNumber2);

		final JButton btnNumber3 = new JButton("3");
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText().concat("3"));
			}
		});
		btnNumber3.setBounds(231, 196, 55, 25);
		contentPane.add(btnNumber3);

		JButton btnAction_Multiplication = new JButton("*");
		btnAction_Multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText() + "*");
			}
		});
		btnAction_Multiplication.setBounds(298, 196, 55, 25);
		contentPane.add(btnAction_Multiplication);

		JButton btnNumber0 = new JButton("0");
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText().concat("0"));
			}
		});
		btnNumber0.setBounds(97, 233, 55, 25);
		contentPane.add(btnNumber0);

		JButton btnAction_equal = new JButton("=");
		btnAction_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAction_equal.setBounds(164, 233, 122, 25);
		contentPane.add(btnAction_equal);

		JButton btnAction_div = new JButton("/");
		btnAction_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result.setText(Result.getText() + "/");
			}
		});
		btnAction_div.setBounds(298, 233, 55, 25);
		contentPane.add(btnAction_div);
	}

}
