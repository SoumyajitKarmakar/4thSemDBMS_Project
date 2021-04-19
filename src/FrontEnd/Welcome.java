package FrontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 255));
		
		JLabel lblNewLabel = new JLabel("DBMS Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Customer");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setOpaque(false);
		
		JRadioButton rdbtnAgent = new JRadioButton("Admin");
		buttonGroup.add(rdbtnAgent);
		rdbtnAgent.setOpaque(false);
		
		JRadioButton rdbtnBuilder = new JRadioButton("Agent");
		buttonGroup.add(rdbtnBuilder);
		rdbtnBuilder.setOpaque(false);
		
		JRadioButton rdbtnBuilderOffice = new JRadioButton("Agent Office");
		buttonGroup.add(rdbtnBuilderOffice);
		rdbtnBuilderOffice.setOpaque(false);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					Customer cust = new Customer();
					dispose();
					cust.setVisible(true);
				}
				else if(rdbtnAgent.isSelected()) {
					Admin admin = new Admin();
					dispose();
					admin.setVisible(true);
				}
				else if(rdbtnBuilder.isSelected()) {
					Agent agent = new Agent();
					dispose();
					agent.setVisible(true);
				}
				else if(rdbtnBuilderOffice.isSelected()) {
					AgentOffice AO = new AgentOffice();
					dispose();
					AO.setVisible(true);
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(76)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
								.addGap(270))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(62)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(rdbtnAgent)
									.addComponent(rdbtnNewRadioButton)
									.addComponent(rdbtnBuilder)
									.addComponent(rdbtnBuilderOffice))
								.addGap(375)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(138)
							.addComponent(btnNewButton)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(85)
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnAgent)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnBuilder)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnBuilderOffice)
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(77))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(0))
		);
		
		JLabel lblNewLabel_1 = new JLabel("User Type");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(97, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(158)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(336, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
