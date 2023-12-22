package PJFrames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nagad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblEnterNagadNumber;
	private JLabel lblEnterYourBkash;
	private JButton payButton;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nagad frame = new Nagad();
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
	public Nagad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(176, 81, 209, 43);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 146, 209, 43);
		contentPane.add(textField_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Downloads\\Nagad-Logo.wine (1).png"));
		lblNewLabel.setBounds(120, 0, 120, 80);
		contentPane.add(lblNewLabel);
		
		lblEnterNagadNumber = new JLabel("Enter Nagad Number:");
		lblEnterNagadNumber.setBounds(22, 81, 149, 43);
		contentPane.add(lblEnterNagadNumber);
		
		lblEnterYourBkash = new JLabel("Enter Your Bkash Pin:");
		lblEnterYourBkash.setBounds(22, 146, 149, 43);
		contentPane.add(lblEnterYourBkash);
		
		payButton = new JButton("Pay Now");
		payButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Payment Accepted...Welcome!");
				HomePage homepage = new HomePage();
				homepage.setVisible(true);
			}
		});
		payButton.setBounds(114, 217, 192, 37);
		contentPane.add(payButton);
	}
}
