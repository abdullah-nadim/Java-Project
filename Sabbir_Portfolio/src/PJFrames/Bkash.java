package PJFrames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bkash extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bkash frame = new Bkash();
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
	public Bkash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(219, 10, 0, 0);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Downloads\\Bkash-logo (1).png"));
		lblNewLabel_4_1.setBounds(152, 21, 90, 43);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblEnterBkashNumber = new JLabel("Enter Bkash Number:");
		lblEnterBkashNumber.setBounds(20, 86, 149, 43);
		contentPane.add(lblEnterBkashNumber);
		
		textField = new JTextField();
		textField.setBounds(150, 86, 209, 43);
		contentPane.add(textField);
		
		JButton payButton = new JButton("Pay Now");
		payButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Payment Accepted...Welcome!");
				HomePage homepage = new HomePage();
				homepage.setVisible(true);
			}
		});
		payButton.setBounds(110, 205, 192, 37);
		contentPane.add(payButton);
		
		JLabel lblEnterYourBkash = new JLabel("Enter Your Bkash Pin:");
		lblEnterYourBkash.setBounds(20, 144, 149, 43);
		contentPane.add(lblEnterYourBkash);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 144, 209, 43);
		contentPane.add(textField_1);
	}
}
