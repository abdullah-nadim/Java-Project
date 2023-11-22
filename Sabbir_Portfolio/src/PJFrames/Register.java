package PJFrames;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	
	JButton btnNewButton_4 = new JButton("Contact");
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		Contact contact = new Contact();
		contact.setVisible(true);
		setVisible(false);
		}
	});
	contentPane.setLayout(null);
	btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\New folder\\Contact\\direct.png"));
	btnNewButton_4.setBounds(631, 16, 121, 23);
	contentPane.add(btnNewButton_4);
	
	JButton btnNewButton_2 = new JButton("Blog");
	btnNewButton_2.setBounds(423, 16, 81, 23);
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		Blog blog = new Blog();
		blog.setVisible(true);
		setVisible(false);
		}			
		
	});
	contentPane.setLayout(null);
	contentPane.add(btnNewButton_2);
	
	JButton btnNewButton = new JButton("Home");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setVisible(true);
		}
	});
	btnNewButton.setBounds(193, 16, 91, 23);
	//btnNewButton.setForeground(new Color(0, 0, 0));
	//btnNewButton.setVerticalAlignment(SwingConstants.TOP);
	//btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
	contentPane.add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Projects");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Projects project = new Projects();
			project.setVisible(true);
		setVisible(false);
		}
	});
	btnNewButton_1.setBounds(309, 16, 104, 23);
	contentPane.add(btnNewButton_1);
	
	JButton btnNewButton_3 = new JButton("Profile");
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Profile profile = new Profile();
			profile.setVisible(true);
		setVisible(false);
		}
	});
	btnNewButton_3.setBounds(514, 16, 104, 23);
	contentPane.add(btnNewButton_3);
	
	JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Graduation Cap (1)\\Graduation Cap (1).png"));
	lblNewLabel_1.setBounds(27, 10, 102, 102);
	contentPane.add(lblNewLabel_1);
	
	}

}
