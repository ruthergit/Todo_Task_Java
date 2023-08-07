package testing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 472, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(16,24,32));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(254, 231, 21));
		textField.setFont(new Font("Verdana", Font.BOLD, 14));
		textField.setBackground(new Color(16, 24, 32));
		textField.setBounds(10, 76, 321, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD TASK");
		btnNewButton.setBackground(new Color(16, 24, 32));
		btnNewButton.setForeground(new Color(254, 231, 21));
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 13));
		btnNewButton.setBounds(341, 78, 105, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("To-Do List");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 26));
		lblNewLabel.setForeground(new Color(254, 231, 21));
		lblNewLabel.setBounds(10, 11, 167, 40);
		contentPane.add(lblNewLabel);
	}
}
