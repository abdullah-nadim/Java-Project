package PJFrames;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Blog extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Blog frame = new Blog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Blog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_2 = new JButton("Blog");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\blog.png"));
		btnNewButton_2.setBounds(302, 36, 94, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				setVisible(true);
			}			
			
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\home.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage home = new HomePage();
			home.setVisible(true);
			setVisible(false);
			}
		});
		btnNewButton.setBounds(188, 36, 104, 23);
		//btnNewButton.setForeground(new Color(0, 0, 0));
		//btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		//btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Projects");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\project (2).png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Projects project = new Projects();
				project.setVisible(true);
			setVisible(false);
			}
		});
		btnNewButton_1.setBounds(406, 36, 114, 23);
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
		btnNewButton_3.setBounds(535, 36, 104, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Graduation Cap (1)\\Graduation Cap (1).png"));
		lblNewLabel_1.setBounds(23, 11, 102, 102);
		contentPane.add(lblNewLabel_1);
		
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Blog\\portfolio (1).png"));
		lblNewLabel.setBounds(319, 131, 192, 120);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Blog\\project (1).png"));
		lblNewLabel_2.setBounds(109, 310, 192, 120);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Blog\\template (1).png"));
		lblNewLabel_3.setBounds(535, 310, 192, 120);
		contentPane.add(lblNewLabel_3);
		
		JTextPane txtpnblog1 = new JTextPane();
		txtpnblog1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnblog1.setBackground(getForeground());
		txtpnblog1.setBorder(null);
		txtpnblog1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut.");
		txtpnblog1.setBounds(123, 188, 186, 94);
		contentPane.add(txtpnblog1);
		
		JTextPane txtpnblog2 = new JTextPane();
		txtpnblog2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnblog2.setBackground(getForeground());
		txtpnblog2.setBorder(null);
		txtpnblog2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut.");
		txtpnblog2.setBounds(345, 347, 156, 102);
		contentPane.add(txtpnblog2);
		
		JTextPane txtpnblog3 = new JTextPane();
		txtpnblog3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnblog3.setBackground(getForeground());
		txtpnblog3.setBorder(null);
		txtpnblog3.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut.");
		txtpnblog3.setBounds(550, 205, 161, 94);
		contentPane.add(txtpnblog3);
		
		JTextPane txtpnTheUltimateGuide = new JTextPane();
		txtpnTheUltimateGuide.setText("The  Ultimate Guide to Design");
		txtpnTheUltimateGuide.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnTheUltimateGuide.setBorder(null);
		txtpnTheUltimateGuide.setBackground((Color) null);
		txtpnTheUltimateGuide.setBounds(121, 136, 171, 58);
		contentPane.add(txtpnTheUltimateGuide);
		
		JTextPane txtpnBenefitOfDoing = new JTextPane();
		txtpnBenefitOfDoing.setText("Benefit Of Doing Projects");
		txtpnBenefitOfDoing.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnBenefitOfDoing.setBorder(null);
		txtpnBenefitOfDoing.setBackground((Color) null);
		txtpnBenefitOfDoing.setBounds(334, 296, 156, 58);
		contentPane.add(txtpnBenefitOfDoing);
		
		JTextPane txtpnSoftwareDesignIs = new JTextPane();
		txtpnSoftwareDesignIs.setText("Software Design is the Begining of every software development");
		txtpnSoftwareDesignIs.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnSoftwareDesignIs.setBorder(null);
		txtpnSoftwareDesignIs.setBackground((Color) null);
		txtpnSoftwareDesignIs.setBounds(540, 129, 171, 58);
		contentPane.add(txtpnSoftwareDesignIs);
		
		
		
	}
}
