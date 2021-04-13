package Root;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Admin extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThisIsAdmin = new JLabel("This is Admin");
		lblThisIsAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsAdmin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThisIsAdmin.setBounds(192, 10, 200, 58);
		contentPane.add(lblThisIsAdmin);
		
		
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Property");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(238, 114, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Agent");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(238, 152, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Builder");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(238, 198, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Modify");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					PropertyUpdate propUp = new PropertyUpdate();
					dispose();
					propUp.setVisible(true);
				}
				else if(rdbtnNewRadioButton_1.isSelected()) {
					AgentUpdate aUp = new AgentUpdate();
					dispose();
					aUp.setVisible(true);
					
				}
				else if(rdbtnNewRadioButton_2.isSelected()) {
					BuilderModify bMod = new BuilderModify();
					dispose();
					bMod.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(320, 284, 97, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * View the table.
				 */
				Output output = new Output();
				dispose();
				output.setVisible(true);
			}
			
		});
		btnNewButton_1.setBounds(147, 284, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
