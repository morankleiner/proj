import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class ProjectsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectsFrame frame = new ProjectsFrame();
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
	public ProjectsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel ProjectsPanel = new JPanel();
		ProjectsPanel.setLayout(null);
		ProjectsPanel.setBounds(0, 0, 1024, 576);
		contentPane.add(ProjectsPanel);
		
		JLabel label = new JLabel("Type:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(57, 75, 134, 20);
		ProjectsPanel.add(label);
		
		JLabel label_1 = new JLabel("Project Name:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(57, 45, 134, 20);
		ProjectsPanel.add(label_1);
		
		JLabel label_2 = new JLabel("Est. Time:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(57, 106, 134, 20);
		ProjectsPanel.add(label_2);
		
		JLabel label_3 = new JLabel("Steps to completion:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(57, 137, 166, 20);
		ProjectsPanel.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(57, 168, 497, 273);
		ProjectsPanel.add(textField);
		
		JLabel label_4 = new JLabel("Links:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(592, 75, 134, 20);
		ProjectsPanel.add(label_4);
		
		JLabel label_5 = new JLabel("Item List:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(592, 45, 134, 20);
		ProjectsPanel.add(label_5);
		
		JLabel label_6 = new JLabel("Priority:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(592, 111, 134, 20);
		ProjectsPanel.add(label_6);
		
		JLabel label_7 = new JLabel("Cost:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(592, 142, 134, 20);
		ProjectsPanel.add(label_7);
		
		JLabel label_8 = new JLabel("Special Tools:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(592, 178, 134, 20);
		ProjectsPanel.add(label_8);
	}

}
