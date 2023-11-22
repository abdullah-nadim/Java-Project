package PJFrames;
//.import PJFrames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUpgradeYourSkill;
	private JTextField txtSkillNow;
	private JTextField txtUpgradeYour;
	private JTextField txtSkillNow_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("Sabbir Portfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_2 = new JButton("Blog");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\project (2).png"));
		btnNewButton_2.setBounds(424, 36, 103, 23);
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
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\home.png"));
		btnNewButton.setBackground(getForeground());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(true);
			}
		});
		btnNewButton.setBounds(184, 36, 102, 23);
		//btnNewButton.setForeground(new Color(0, 0, 0));
		//btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		//btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Projects");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\blog.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Projects project = new Projects();
				project.setVisible(true);
			setVisible(false);
			}
		});
		btnNewButton_1.setBounds(296, 36, 118, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Profile");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\profile-user.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile profile = new Profile();
				profile.setVisible(true);
			setVisible(false);
			}
		});
		btnNewButton_3.setBounds(537, 36, 104, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Desktop Prototype (1)\\Desktop Prototype (1).png"));
		lblNewLabel.setBounds(64, 113, 512, 320);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Contact");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Contact contact = new Contact();
			contact.setVisible(true);
			setVisible(false);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\contact.png"));
		btnNewButton_4.setBounds(649, 36, 109, 23);
		contentPane.add(btnNewButton_4);
		
		txtUpgradeYour = new JTextField();
		txtUpgradeYour.setBorder(null);
		txtUpgradeYour.setBackground(getForeground());
		txtUpgradeYour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		txtUpgradeYour.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtUpgradeYour.setHorizontalAlignment(SwingConstants.CENTER);
		txtUpgradeYour.setText("UPGRADE YOUR");
		txtUpgradeYour.setBounds(525, 145, 225, 43);
		contentPane.add(txtUpgradeYour);
		txtUpgradeYour.setColumns(10);
		
		txtSkillNow_1 = new JTextField();
		txtSkillNow_1.setBorder(null);
		txtSkillNow_1.setBackground(getForeground());
		txtSkillNow_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkillNow_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSkillNow_1.setText("SKILL NOW");
		txtSkillNow_1.setBounds(559, 187, 156, 20);
		contentPane.add(txtSkillNow_1);
		txtSkillNow_1.setColumns(10);
		
		JTextPane txtpnLoremIpsumDolor = new JTextPane();
		txtpnLoremIpsumDolor.setBackground(getForeground());
		txtpnLoremIpsumDolor.setBorder(null);
		txtpnLoremIpsumDolor.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut.");
		txtpnLoremIpsumDolor.setBounds(569, 225, 156, 73);
		contentPane.add(txtpnLoremIpsumDolor);
		
		JButton btnNewButton_5 = new JButton("Register Now");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register register = new Register(); 
				register.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5.setBounds(586, 311, 118, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Graduation Cap (1)\\Graduation Cap (1).png"));
		lblNewLabel_1.setBounds(27, 10, 102, 102);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(237, 35, 5, 22);
		contentPane.add(textArea);
		
		
		
		
	}
}
