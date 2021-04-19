package FrontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import keeptoo.KGradientPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import keeptoo.KTextField;
import keeptoo.KButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GradientWelcom extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradientWelcom frame = new GradientWelcom();
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
	public GradientWelcom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kEndColor = new Color(204, 0, 255);
		gradientPanel.setkStartColor(new Color(102, 0, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(gradientPanel, GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(gradientPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
		);
		
		KButton btnSubmit = new KButton();
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmit.setText("Submit");
		btnSubmit.kHoverEndColor = new Color(0, 0, 153);
		btnSubmit.kStartColor = new Color(204, 0, 255);
		btnSubmit.kEndColor = new Color(102, 0, 255);
		
		JLabel lblNewLabel = new JLabel("DBMS Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
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
		
		JLabel lblNewLabel_1 = new JLabel("User Type :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_gradientPanel = new GroupLayout(gradientPanel);
		gl_gradientPanel.setHorizontalGroup(
			gl_gradientPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_gradientPanel.createSequentialGroup()
					.addGap(264)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
					.addGap(275))
				.addGroup(gl_gradientPanel.createSequentialGroup()
					.addGap(275)
					.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(295))
				.addGroup(gl_gradientPanel.createSequentialGroup()
					.addGap(69)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addGap(87)
					.addGroup(gl_gradientPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnBuilderOffice)
						.addComponent(rdbtnBuilder)
						.addComponent(rdbtnAgent)
						.addComponent(rdbtnNewRadioButton))
					.addContainerGap(348, Short.MAX_VALUE))
		);
		gl_gradientPanel.setVerticalGroup(
			gl_gradientPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_gradientPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addGap(82)
					.addGroup(gl_gradientPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(rdbtnAgent)
					.addGap(18)
					.addComponent(rdbtnBuilder)
					.addGap(18)
					.addComponent(rdbtnBuilderOffice)
					.addGap(44)
					.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(79))
		);
		gradientPanel.setLayout(gl_gradientPanel);
		contentPane.setLayout(gl_contentPane);
	}
}
