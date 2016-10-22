import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class ItemListFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemListFrame frame = new ItemListFrame();
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
	public ItemListFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 610);
		getContentPane().setLayout(null);
		
		JPanel ItemListPane = new JPanel();
		ItemListPane.setLayout(null);
		ItemListPane.setBounds(0, 0, 1024, 576);
		getContentPane().add(ItemListPane);
		
		JLabel label = new JLabel("Type:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(57, 75, 134, 20);
		ItemListPane.add(label);
		
		JLabel label_1 = new JLabel("Item Name:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(57, 45, 134, 20);
		ItemListPane.add(label_1);
		
		JLabel label_2 = new JLabel("Price:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(57, 106, 134, 20);
		ItemListPane.add(label_2);
		
		JLabel label_3 = new JLabel("Quntity in stock:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(57, 168, 166, 20);
		ItemListPane.add(label_3);
		
		JLabel label_4 = new JLabel("Links:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(57, 137, 134, 20);
		ItemListPane.add(label_4);
		
		JLabel label_5 = new JLabel("Price:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(57, 199, 134, 20);
		ItemListPane.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(527, 106, 460, 331);
		ItemListPane.add(panel_1);
		
		JLabel label_6 = new JLabel("No Picture");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(185, 139, 108, 20);
		panel_1.add(label_6);
		
		JButton button = new JButton("Open Data Sheet");
		button.setBounds(57, 230, 115, 23);
		ItemListPane.add(button);
	}

}
// update