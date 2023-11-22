package PJFrames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Projects extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBeginnerProject;
	private JTextField txtBasicrProject;
	private JTextField txtAdvanceProject;
	private JTextField txtSeeMore;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projects frame = new Projects();
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
	public Projects() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\home.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage home = new HomePage();
			home.setVisible(true);
			setVisible(false);
			}
		});
		btnNewButton.setBounds(179, 36, 103, 23);
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
		btnNewButton_1.setBounds(407, 36, 118, 23);
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
		btnNewButton_3.setBounds(544, 36, 126, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Blog");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\blog.png"));
		btnNewButton_2.setBounds(292, 36, 105, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Blog blog = new Blog();
			blog.setVisible(true);
			setVisible(false);
			}					
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Graduation Cap (1)\\Graduation Cap (1).png"));
		lblNewLabel_1.setBounds(34, 14, 102, 102);
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
		btnNewButton_4.setBounds(680, 36, 109, 23);
		contentPane.add(btnNewButton_4);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(179,170,255));
		panel.setBounds(45, 158, 240, 280);
		contentPane.add(panel);
		
		txtBeginnerProject = new JTextField();
		txtBeginnerProject.setEditable(false);
		txtBeginnerProject.setText("Beginner Project");
		txtBeginnerProject.setHorizontalAlignment(SwingConstants.CENTER);
		txtBeginnerProject.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBeginnerProject.setColumns(10);
		txtBeginnerProject.setBorder(null);
		txtBeginnerProject.setBackground((Color) null);
		txtBeginnerProject.setBounds(15, 55, 225, 37);
		panel.add(txtBeginnerProject);
		
		JTextPane txtpnLoremIpsumDolor = new JTextPane();
		txtpnLoremIpsumDolor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnLoremIpsumDolor.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut.");
		txtpnLoremIpsumDolor.setBorder(null);
		txtpnLoremIpsumDolor.setBackground((Color) null);
		txtpnLoremIpsumDolor.setBounds(52, 103, 156, 73);
		panel.add(txtpnLoremIpsumDolor);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\New folder\\Project\\text.png"));
		lblNewLabel.setBounds(89, 26, 36, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\rating (1) (1).png"));
		lblNewLabel_2.setBounds(52, 202, 146, 37);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(new Color(86,105,219));
		panel_1.setBounds(320, 158, 240, 280);
		contentPane.add(panel_1);
		
		txtBasicrProject = new JTextField();
		txtBasicrProject.setHorizontalAlignment(SwingConstants.CENTER);
		txtBasicrProject.setText("Basic Project");
		txtBasicrProject.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBasicrProject.setEditable(false);
		txtBasicrProject.setColumns(10);
		txtBasicrProject.setBorder(null);
		txtBasicrProject.setBackground((Color) null);
		txtBasicrProject.setBounds(0, 55, 225, 37);
		panel_1.add(txtBasicrProject);
		
		JTextPane txtpnLoremIpsumDolor_1 = new JTextPane();
		txtpnLoremIpsumDolor_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnLoremIpsumDolor_1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut.");
		txtpnLoremIpsumDolor_1.setBorder(null);
		txtpnLoremIpsumDolor_1.setBackground((Color) null);
		txtpnLoremIpsumDolor_1.setBounds(52, 103, 156, 73);
		panel_1.add(txtpnLoremIpsumDolor_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\proj\\text.png"));
		lblNewLabel_5.setBounds(89, 26, 36, 36);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\rating (1) (1).png"));
		lblNewLabel_2_1.setBounds(39, 201, 146, 37);
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBackground(new Color(63,33,130));
		panel_2.setBounds(606, 158, 240, 280);
		contentPane.add(panel_2);
		
		txtAdvanceProject = new JTextField();
		txtAdvanceProject.setForeground(new Color(192, 192, 192));
		txtAdvanceProject.setText("Advance Project");
		txtAdvanceProject.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdvanceProject.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAdvanceProject.setEditable(false);
		txtAdvanceProject.setColumns(10);
		txtAdvanceProject.setBorder(null);
		txtAdvanceProject.setBackground((Color) null);
		txtAdvanceProject.setBounds(15, 55, 225, 37);
		panel_2.add(txtAdvanceProject);
		
		JTextPane txtpnLoremIpsumDolor_2 = new JTextPane();
		txtpnLoremIpsumDolor_2.setForeground(new Color(192, 192, 192));
		txtpnLoremIpsumDolor_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnLoremIpsumDolor_2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut.");
		txtpnLoremIpsumDolor_2.setBorder(null);
		txtpnLoremIpsumDolor_2.setBackground((Color) null);
		txtpnLoremIpsumDolor_2.setBounds(52, 103, 156, 88);
		panel_2.add(txtpnLoremIpsumDolor_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(89, 26, 36, 36);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setBounds(38, 202, 60, 24);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\proj\\text.png"));
		lblNewLabel_5_1.setBounds(103, 26, 36, 36);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\rating (1) (1).png"));
		lblNewLabel_2_2.setBounds(48, 202, 146, 37);
		panel_2.add(lblNewLabel_2_2);
		
		RoundedPanel panel_3 = new RoundedPanel(20,new Color(106, 90, 205));
		panel_3.setLayout(null);
		panel_3.setBorder(null);
		panel_3.setForeground(Color.BLACK);
		//panel_3.setBackground(new Color(106, 90, 205));
		panel_3.setBounds(345, 472, 180, 50);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\rsz_1rsz_right-arrow.png"));
		lblNewLabel_2_4.setBounds(145, 11, 45, 37);
		panel_3.add(lblNewLabel_2_4);
		
		txtSeeMore = new JTextField();
		txtSeeMore.setBounds(10, 10, 152, 37);
		panel_3.add(txtSeeMore);
		txtSeeMore.setText("SEE MORE");
		txtSeeMore.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeeMore.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSeeMore.setEditable(false);
		txtSeeMore.setColumns(10);
		txtSeeMore.setBorder(null);
		txtSeeMore.setBackground(new Color(106, 90, 205));
		
		
        
		
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
