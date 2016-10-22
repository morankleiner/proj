import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

public class SearchFrame extends JFrame {
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFrame frame = new SearchFrame();
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
	public SearchFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 610);
		getContentPane().setLayout(null);
		
		JPanel SearchPanel = new JPanel();
		SearchPanel.setLayout(null);
		SearchPanel.setBounds(0, 0, 1024, 576);
		getContentPane().add(SearchPanel);
		
		JLabel label = new JLabel("Search:");
		label.setBounds(27, 29, 46, 14);
		SearchPanel.add(label);
		
		textField = new JTextField();
		textField.setText("type the name of a project , type ,tag  etc...");
		textField.setColumns(10);
		textField.setBounds(65, 26, 232, 20);
		SearchPanel.add(textField);
		
		JLabel label_1 = new JLabel("Change");
		label_1.setBounds(531, 313, 130, 14);
		SearchPanel.add(label_1);
		
		JLabel label_2 = new JLabel("Here you will see all your ");
		label_2.setBounds(404, 313, 130, 14);
		SearchPanel.add(label_2);
		
		table = new JTable();
		table.setBounds(48, 66, 916, 427);
		SearchPanel.add(table);
		
		JButton button = new JButton("Select");
		button.setBounds(875, 25, 89, 23);
		SearchPanel.add(button);
		
		JButton button_1 = new JButton("Add New");
		button_1.setBounds(875, 504, 89, 23);
		SearchPanel.add(button_1);
	}

}
