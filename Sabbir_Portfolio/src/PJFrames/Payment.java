package PJFrames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Payment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameTextField;
    private JTextField cardNumberTextField;
    private JTextField expDateTextField;
    private JTextField cvvTextField;

	/**
	 * Launch the application.
	 */
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 *  private JTextField nameTextField;
    private JTextField cardNumberTextField;
    private JTextField expDateTextField;
    private JTextField cvvTextField;

    public PaymentPanel() {
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        nameTextField = new JTextField();

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberTextField = new JTextField();

        JLabel expDateLabel = new JLabel("Expiration Date:");
        expDateTextField = new JTextField();

        JLabel cvvLabel = new JLabel("CVV:");
        cvvTextField = new JTextField();

        JButton payButton = new JButton("Pay Now");
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your payment processing logic here
                System.out.println("Processing payment...");
            }
        });

        add(nameLabel);
        add(nameTextField);
        add(cardNumberLabel);
        add(cardNumberTextField);
        add(expDateLabel);
        add(expDateTextField);
        add(cvvLabel);
        add(cvvTextField);
        add(payButton);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Payment Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PaymentPanel paymentPanel = new PaymentPanel();
        frame.getContentPane().add(paymentPanel);

        frame.pack();
        frame.setVisible(true);
    }
	 */
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

        JLabel nameLabel = new JLabel("Card Holder's Name:");
        nameLabel.setBounds(66, 145, 209, 43);
        nameTextField = new JTextField();
        nameTextField.setBounds(309, 145, 209, 43);

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberLabel.setBounds(66, 216, 209, 43);
        cardNumberTextField = new JTextField();
        cardNumberTextField.setBounds(309, 216, 209, 43);

        JLabel expDateLabel = new JLabel("Expiration Date:");
        expDateLabel.setBounds(66, 288, 209, 43);
        expDateTextField = new JTextField();
        expDateTextField.setBounds(309, 288, 209, 43);

        JLabel cvvLabel = new JLabel("CVV:");
        cvvLabel.setBounds(66, 358, 209, 43);
        cvvTextField = new JTextField();
        cvvTextField.setBounds(309, 358, 209, 43);

        JButton payButton = new JButton("Pay Now");
        payButton.setBounds(204, 448, 209, 43);
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add your payment processing logic here
            	JOptionPane.showMessageDialog(null, "Processing payment...!");
               // System.out.println("Processing payment...");
            	HomePage homepage = new HomePage();
				homepage.setVisible(true);
            }

			
        });
        contentPane.setLayout(null);

        getContentPane().add(nameLabel);
        getContentPane().add(nameTextField);
        getContentPane().add(cardNumberLabel);
        getContentPane().add(cardNumberTextField);
        getContentPane().add(expDateLabel);
        getContentPane().add(expDateTextField);
        getContentPane().add(cvvLabel);
        getContentPane().add(cvvTextField);
        getContentPane().add(payButton);
        
        
        JButton btnNewButton_4 = new JButton("Contact");
    	btnNewButton_4.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		Contact contact = new Contact();
    		contact.setVisible(true);
    		setVisible(false);
    		}
    	});
    	contentPane.setLayout(null);
    	btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\contact.png"));
    	btnNewButton_4.setBounds(631, 16, 121, 23);
    	contentPane.add(btnNewButton_4);
    	
    	JButton btnNewButton_2 = new JButton("Blog");
    	btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\blog.png"));
    	btnNewButton_2.setBounds(413, 16, 91, 23);
    	btnNewButton_2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		Blog blog = new Blog();
    		blog.setVisible(true);
    		setVisible(false);
    		}			
    		
    	});
    	contentPane.setLayout(null);
    	contentPane.add(btnNewButton_2);
    	
    	JButton btnNewButton_1 = new JButton("Projects");
    	btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\project (2).png"));
    	btnNewButton_1.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			Projects project = new Projects();
    			project.setVisible(true);
    		setVisible(false);
    		}
    	});
    	btnNewButton_1.setBounds(288, 16, 115, 23);
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
    	btnNewButton_3.setBounds(514, 16, 104, 23);
    	contentPane.add(btnNewButton_3);
    	
    	JLabel lblNewLabel_1 = new JLabel("");
    	lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Graduation Cap (1)\\Graduation Cap (1).png"));
    	lblNewLabel_1.setBounds(10, 16, 102, 102);
    	contentPane.add(lblNewLabel_1);
		
    	JButton btnNewButton = new JButton("Home");
    	btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\icon (1)\\home.png"));
    	//btnNewButton.setBackground(new Color(255, 255, 255));
    	btnNewButton.setBounds(174, 16, 104, 23);
    	contentPane.add(btnNewButton);
    	
    	JLabel lblNewLabel = new JLabel("");
    	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Downloads\\logo (1).png"));
    	lblNewLabel.setBounds(306, 75, 48, 43);
    	contentPane.add(lblNewLabel);
    	
    	JLabel lblNewLabel_2 = new JLabel("");
    	lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\kisspng-mastercard-logo-credit-c (1).png"));
    	lblNewLabel_2.setBounds(405, 75, 59, 43);
    	contentPane.add(lblNewLabel_2);
    	
    	JCheckBox chckbxNewCheckBox = new JCheckBox("");
    	chckbxNewCheckBox.setBounds(279, 86, 26, 23);
    	contentPane.add(chckbxNewCheckBox);
    	
    	JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
    	chckbxNewCheckBox_1.setBounds(373, 86, 26, 23);
    	contentPane.add(chckbxNewCheckBox_1);
    	
    	RoundedPanel panel = new RoundedPanel(20, null);
    	panel.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    		}
    	});
    	panel.setBounds(575, 82, 203, 330);
    	contentPane.add(panel);
    	panel.setLayout(null);
    	
    	JLabel lblNewLabel_3 = new JLabel("");
    	lblNewLabel_3.setBounds(45, 73, 120, 80);
    	panel.add(lblNewLabel_3);
    	lblNewLabel_3.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			Nagad nagad = new Nagad();
    			nagad.setVisible(true);
    			setVisible(false);
    		}
    	});
    	lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Downloads\\Nagad-Logo.wine (1).png"));
    	
    	JLabel lblNewLabel_4 = new JLabel("");
    	lblNewLabel_4.setBounds(75, 186, 90, 43);
    	panel.add(lblNewLabel_4);
    	lblNewLabel_4.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			Bkash bkash= new Bkash();
    			bkash.setVisible(true);
    			setVisible(false);
    		}
    	});
    	lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Downloads\\Bkash-logo (1).png"));
    	
    	JLabel lblNewLabel_5 = new JLabel("Mobile Banking");
    	lblNewLabel_5.setBounds(72, 23, 93, 27);
    	panel.add(lblNewLabel_5);
    	btnNewButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		HomePage homepage = new HomePage();
    		homepage.setVisible(true);
    		setVisible(false);
    		}
    	});
		
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

