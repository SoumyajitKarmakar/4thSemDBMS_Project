package Root;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(138, 224, 73, 21);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		final JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(138, 268, 73, 21);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(245, 225, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(245, 269, 96, 19);
		contentPane.add(passwordField);
		passwordField.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("User Type");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(112, 31, 99, 52);
		contentPane.add(lblNewLabel);
		
		/*lblNewLabel_1.setVisible(true);
		lblNewLabel_1_1.setVisible(true);
		textField.setVisible(true);
		textField_1.setVisible(true);*/
		
		final JRadioButton Agent = new JRadioButton("Agent");
		Agent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setVisible(true);
				lblNewLabel_1_1.setVisible(true);
				textField.setVisible(true);
				passwordField.setVisible(true);
			}
		});
		Agent.setBounds(285, 67, 103, 21);
		buttonGroup.add(Agent);
		contentPane.add(Agent);
		
		final JRadioButton AgentOffice = new JRadioButton("Agent Office");
		AgentOffice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setVisible(true);
				lblNewLabel_1_1.setVisible(true);
				textField.setVisible(true);
				passwordField.setVisible(true);
			}
		});
		AgentOffice.setBounds(285, 104, 103, 21);
		buttonGroup.add(AgentOffice);
		contentPane.add(AgentOffice);
		
		final JRadioButton Admin = new JRadioButton("Admin");
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setVisible(true);
				lblNewLabel_1_1.setVisible(true);
				textField.setVisible(true);
				passwordField.setVisible(true);
			}
		});
		Admin.setBounds(285, 141, 103, 21);
		buttonGroup.add(Admin);
		contentPane.add(Admin);
		
		final JRadioButton UserButton = new JRadioButton("User");
		UserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setVisible(false);
				lblNewLabel_1_1.setVisible(false);
				textField.setVisible(false);
				passwordField.setVisible(false);
			}
		});
		buttonGroup.add(UserButton);
		UserButton.setBounds(285, 31, 103, 21);
		contentPane.add(UserButton);
		
		
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.setBounds(191, 319, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Agent.isSelected()) {
					/*
					Verify the username and password.
					*/
					Agent agent = new Agent();
					dispose();
					agent.setVisible(true);
				}
				else if(AgentOffice.isSelected()) {
					/*
					Verify the username and password.
					*/
					AgentOffice agentOffice = new AgentOffice();
					dispose();
					agentOffice.setVisible(true);
				}
				else if(Admin.isSelected()) {
					/*
					Verify the username and password.
					*/
					Admin admin = new Admin();
					dispose();
					admin.setVisible(true);
				}
				else if(UserButton.isSelected()) {
					User user = new User();
					dispose();
					user.setVisible(true);
				}
				
				
				
			}
		});
		contentPane.add(btnNewButton);
		
		
	}
}
