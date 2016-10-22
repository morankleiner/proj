import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JList;
import javax.swing.JLabel;

public class BuyListFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyListFrame frame = new BuyListFrame();
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
	public BuyListFrame() {
		setSize(new Dimension(419, 630));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 576);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 1024, 576));
		contentPane.setSize(new Dimension(1024, 576));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(141, 134, 527, 353);
		contentPane.add(list);
		
		JLabel lblBuyList = new JLabel("Buy List");
		lblBuyList.setBounds(42, 11, 138, 39);
		contentPane.add(lblBuyList);
	}
}
