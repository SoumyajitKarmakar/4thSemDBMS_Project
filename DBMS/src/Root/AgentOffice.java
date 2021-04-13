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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgentOffice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgentOffice frame = new AgentOffice();
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
	public AgentOffice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThisIsAgentoffice = new JLabel("This is AgentOffice");
		lblThisIsAgentoffice.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsAgentoffice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThisIsAgentoffice.setBounds(183, 22, 201, 51);
		contentPane.add(lblThisIsAgentoffice);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AOview aov = new AOview();
				dispose();
				aov.setVisible(true);
			}
		});
		btnNewButton.setBounds(127, 213, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AOupdate aou = new AOupdate();
				dispose();
				aou.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(314, 213, 85, 21);
		contentPane.add(btnNewButton_1);
	}

}
