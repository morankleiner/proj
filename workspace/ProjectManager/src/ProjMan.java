import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.Color;

public class ProjMan {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjMan window = new ProjMan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProjMan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1087, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel MainMenuPanel = new JPanel();
		frame.getContentPane().add(MainMenuPanel, "name_595588498016620");
		MainMenuPanel.setLayout(null);
		
		JLabel lblThisIsThe = new JLabel("This is the main menu");
		lblThisIsThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsThe.setBounds(405, 11, 210, 43);
		MainMenuPanel.add(lblThisIsThe);
		
		JButton btnProjects = new JButton("Projects");
		btnProjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				ProjectsFrame projFrame = new ProjectsFrame();
				projFrame.setVisible(true);
				
				
			}
		});
		btnProjects.setBounds(468, 65, 89, 23);
		MainMenuPanel.add(btnProjects);
		
		JButton btnToDo = new JButton("ToDo list");
		btnToDo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				ToDoList toDoListFrame = new ToDoList();
				toDoListFrame.setVisible(true);
				
			}
		});
		btnToDo.setBounds(468, 99, 89, 23);
		MainMenuPanel.add(btnToDo);
		
		JButton btnItemList = new JButton("Item list");
		btnItemList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				ToDoList toDoListFrame = new ToDoList();
				toDoListFrame.setVisible(true);
				
			}
		});
		btnItemList.setBounds(468, 133, 89, 23);
		MainMenuPanel.add(btnItemList);
		
		JButton btnBuyList = new JButton("Buy list");
		btnBuyList.setBounds(468, 167, 89, 23);
		MainMenuPanel.add(btnBuyList);
	}
}
