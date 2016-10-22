import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ToDoList extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToDoList frame = new ToDoList();
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
	public ToDoList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel ToDoPanel = new JPanel();
		ToDoPanel.setBounds(0, 0, 1024, 576);
		ToDoPanel.setLayout(null);
		contentPane.add(ToDoPanel);
		
		JLabel label = new JLabel("To Do List:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(37, 28, 124, 21);
		ToDoPanel.add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		textField.setAlignmentY(0.0f);
		textField.setAlignmentX(0.0f);
		textField.setBounds(37, 65, 428, 379);
		ToDoPanel.add(textField);
	}

}
