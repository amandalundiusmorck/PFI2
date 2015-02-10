import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtAnimalList;
	private ArrayList<Animal> animals = new ArrayList<Animal>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 42, 412, 200);
		contentPane.add(textArea);

		txtAnimalList = new JTextField();
		txtAnimalList.setEditable(false);
		txtAnimalList.setFont(new Font("Calibri", Font.BOLD, 19));
		txtAnimalList.setForeground(Color.DARK_GRAY);
		txtAnimalList.setText("Animal list");
		txtAnimalList.setBounds(10, 11, 110, 20);
		contentPane.add(txtAnimalList);
		txtAnimalList.setColumns(10);

		animals.add(new Snake("slingrigus serpentus", false));
		animals.add(new Dog("hund", "barkus svansus", true));
		animals.add(new Cat("purrus meowus", 10, 5));
		animals.add(new Snake("slingrigare serpentus", true));
		animals.add(new Dog("barkussss svansigare", false, 8));
		
		for (int i = 0; i < animals.size(); i++){
			textArea.append(animals.get(i).getInfo() + "\n");
		}
	}
}
