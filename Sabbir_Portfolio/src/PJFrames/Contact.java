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
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Contact extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtMessage;
	private JTextField txtLastName;
	private JTextField txtPhoneNo;
	private JTextField textField_1;
	private JTextField txtEmail;
	private JTextField txtWriteYourMessages;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact frame = new Contact();
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
	public Contact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton btnNewButton = new JButton("Home");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\home.png"));
		btnNewButton.setBackground(getForeground());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(true);
			}
		});
		btnNewButton.setBounds(171, 36, 102, 23);
		//btnNewButton.setForeground(new Color(0, 0, 0));
		//btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		//btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Graduation Cap (1)\\Graduation Cap (1).png"));
		lblNewLabel_1.setBounds(27, 10, 102, 102);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Projects");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\blog.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Projects project = new Projects();
				project.setVisible(true);
			setVisible(false);
			}
		});
		btnNewButton_1.setBounds(396, 36, 118, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Blog");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\project (2).png"));
		btnNewButton_2.setBounds(283, 36, 103, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Blog blog = new Blog();
			blog.setVisible(true);
			setVisible(false);
			}			
			
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_2);
		
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
		
		JTextPane txtpnGet = new JTextPane();
		txtpnGet.setForeground(new Color(0, 128, 192));
		txtpnGet.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnGet.setText("Get In Touch");
		txtpnGet.setBorder(null);
		txtpnGet.setBackground((Color) null);
		txtpnGet.setBounds(334, 94, 180, 33);
		contentPane.add(txtpnGet);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(206,214,255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(189, 138, 501, 275);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setEditable(false);
		txtFirstName.setText("First Name*:");
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(null);
		txtFirstName.setBackground((Color) null);
		txtFirstName.setBounds(0, 30, 225, 37);
		panel.add(txtFirstName);
		
		txtMessage = new JTextField();
		txtMessage.setEditable(false);
		txtMessage.setText("Message*:");
		txtMessage.setHorizontalAlignment(SwingConstants.CENTER);
		txtMessage.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtMessage.setColumns(10);
		txtMessage.setBorder(null);
		txtMessage.setBackground((Color) null);
		txtMessage.setBounds(10, 184, 178, 28);
		panel.add(txtMessage);
		
		txtLastName = new JTextField();
		txtLastName.setEditable(false);
		txtLastName.setText("Last Name*:");
		txtLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtLastName.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtLastName.setColumns(10);
		txtLastName.setBorder(null);
		txtLastName.setBackground((Color) null);
		txtLastName.setBounds(240, 27, 225, 43);
		panel.add(txtLastName);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setEditable(false);
		txtPhoneNo.setText("Phone NO*:");
		txtPhoneNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBorder(null);
		txtPhoneNo.setBackground((Color) null);
		txtPhoneNo.setBounds(247, 116, 198, 43);
		panel.add(txtPhoneNo);
		
		textField_1 = new JTextField();
		textField_1.setText("_____________");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground((Color) null);
		textField_1.setBounds(36, 62, 178, 43);
		panel.add(textField_1);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setText("Email*:");
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground((Color) null);
		txtEmail.setBounds(10, 116, 160, 43);
		panel.add(txtEmail);
		
		txtWriteYourMessages = new JTextField();
		txtWriteYourMessages.setForeground(new Color(0, 64, 128));
		txtWriteYourMessages.setText("Write your messages here.....");
		txtWriteYourMessages.setHorizontalAlignment(SwingConstants.CENTER);
		txtWriteYourMessages.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtWriteYourMessages.setColumns(10);
		txtWriteYourMessages.setBorder(null);
		txtWriteYourMessages.setBackground((Color) null);
		txtWriteYourMessages.setBounds(47, 223, 242, 41);
		panel.add(txtWriteYourMessages);
		
		textField = new JTextField();
		textField.setText("_____________");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground((Color) null);
		textField.setBounds(275, 62, 178, 43);
		panel.add(textField);
		
		textField_3 = new JTextField();
		textField_3.setText("_____________");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground((Color) null);
		textField_3.setBounds(36, 143, 178, 43);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("_____________");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground((Color) null);
		textField_4.setBounds(275, 146, 170, 37);
		panel.add(textField_4);
		
		JButton btnNewButton_5 = new JButton("Submit");
		btnNewButton_5.setBackground(new Color(128, 128, 192));
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setBounds(396, 452, 89, 23);
		contentPane.add(btnNewButton_5);
		
		
	}
	
	static class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
}
