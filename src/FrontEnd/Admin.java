package FrontEnd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;

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
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 255));
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Property");
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setOpaque(false);
		
		JRadioButton rdbtnAgent = new JRadioButton("Agent");
		buttonGroup.add(rdbtnAgent);
		buttonGroup.add(rdbtnAgent);
		rdbtnAgent.setOpaque(false);
		
		JRadioButton rdbtnBuilder = new JRadioButton("Builder");
		buttonGroup.add(rdbtnBuilder);
		buttonGroup.add(rdbtnBuilder);
		rdbtnBuilder.setOpaque(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setVisible(false);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setVisible(true);
			}
		});
		
		
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setVisible(false);
				if(rdbtnNewRadioButton.isSelected()) {
					PropertyUpdate PU = new PropertyUpdate();
					dispose();
					PU.setVisible(true);
				}
				else if(rdbtnAgent.isSelected()) {
					AdminAgentUpdate AAU = new AdminAgentUpdate();
					dispose();
					AAU.setVisible(true);
				}
				else if(rdbtnBuilder.isSelected()) {
					BuilderUpdate BU = new BuilderUpdate();
					dispose();
					BU.setVisible(true);
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome welcome = new Welcome();
				dispose();
				welcome.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(76)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
							.addGap(270))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(62)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnAgent)
								.addComponent(rdbtnBuilder))
							.addGap(391))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(138)
							.addComponent(btnNewButton)
							.addGap(73)
							.addComponent(btnModify, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addGap(66)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnAgent)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnBuilder)
					.addGap(30)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnModify)
						.addComponent(btnNewButton_1))
					.addGap(32))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
					.addGap(0))
		);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Select table");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(100, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(127)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(367, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
