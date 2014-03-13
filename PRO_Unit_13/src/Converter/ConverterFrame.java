package Converter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConverterFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMiles;
	private JTextField textFieldKilometers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterFrame frame = new ConverterFrame();
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
	public ConverterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Miles:");
		lblNewLabel.setBounds(37, 56, 98, 35);
		contentPane.add(lblNewLabel);

		JLabel lblKilometers = new JLabel("Kilometers: ");
		lblKilometers.setBounds(37, 103, 98, 15);
		contentPane.add(lblKilometers);

		textFieldMiles = new JTextField();
		textFieldMiles.setBounds(140, 64, 114, 19);
		contentPane.add(textFieldMiles);
		textFieldMiles.setColumns(10);

		textFieldKilometers = new JTextField();
		textFieldKilometers.setBounds(140, 101, 114, 19);
		contentPane.add(textFieldKilometers);
		textFieldKilometers.setColumns(10);

		JButton btnConvertToMiles = new JButton("Convert");
		btnConvertToMiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float km;
				try {
					km = (float) (Integer.parseInt(textFieldMiles.getText()) * 1.6);
					textFieldMiles.setText(km + " Kilometers");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConvertToMiles.setBounds(283, 61, 117, 25);
		contentPane.add(btnConvertToMiles);

		JButton btnConvertToKilometers = new JButton("convert");
		btnConvertToKilometers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {float miles;
				
					miles = (float) (Integer.parseInt(textFieldKilometers
							.getText()) / 1.6);
					textFieldKilometers.setText(miles + " Miles");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnConvertToKilometers.setBounds(283, 98, 117, 25);
		contentPane.add(btnConvertToKilometers);
	}
}
