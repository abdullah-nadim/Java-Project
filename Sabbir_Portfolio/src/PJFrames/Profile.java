package PJFrames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;

public class Profile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_2 = new JButton("Blog");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\blog.png"));
		btnNewButton_2.setBounds(95, 414, 104, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Blog blog = new Blog();
				blog.setVisible(true);
				//setVisible(false);
				setVisible(false);
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
		btnNewButton.setBounds(96, 319, 103, 23);
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
		btnNewButton_1.setBounds(95, 369, 104, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Profile");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\profile-user.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			setVisible(true);
			}
		});
		btnNewButton_3.setBounds(95, 459, 104, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Graduation Cap (1)\\Graduation Cap (1).png"));
		lblNewLabel_1.setBounds(676, 24, 102, 102);
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
		btnNewButton_4.setBounds(95, 508, 109, 23);
		contentPane.add(btnNewButton_4);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 192, 192));
        panel.setBounds(10, 24, 328, 607);
        contentPane.add(panel);
        panel.setLayout(null);
        JLabel imageLabel1 = new JLabel(new ImageIcon("C:\\Users\\ASUS\\Downloads\\rsz_1whatsapp_image_2023-11-21_at_92 (1).png"));
        imageLabel1.setBounds(65, 26, 200, 200);
        panel.add(imageLabel1);
        imageLabel1.setBackground(new Color(192, 192, 192));
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\—Pngtree—cartoon vector mbe desi.png"));
        lblNewLabel.setBounds(405, 59, 320, 320);
        contentPane.add(lblNewLabel);
        
        JTextPane txtpnIAmA = new JTextPane();
        txtpnIAmA.setFont(new Font("Tahoma", Font.BOLD, 16));
        txtpnIAmA.setText("I am a passionate and results-driven professional with a keen eye for detail and a commitment to creating engaging and user-friendly digital experiences.");
        txtpnIAmA.setBorder(null);
        txtpnIAmA.setBackground((Color) null);
        txtpnIAmA.setBounds(415, 394, 302, 102);
        contentPane.add(txtpnIAmA);
		
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
