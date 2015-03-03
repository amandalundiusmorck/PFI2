package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class GUI extends JFrame {

	private JPanel contentPane;

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
		setFont(new Font("Calibri", Font.BOLD, 20));
		setTitle("Sk\u00E5netrafiken");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUbtshallen = new JLabel("Ub\u00E5tshallen");
		lblUbtshallen.setForeground(Color.ORANGE);
		lblUbtshallen.setFont(new Font("Calibri", Font.BOLD, 25));
		lblUbtshallen.setBackground(new Color(240, 240, 240));
		lblUbtshallen.setBounds(12, 13, 134, 31);
		contentPane.add(lblUbtshallen);
		
		JLabel lblLinje = new JLabel("Linje");
		lblLinje.setForeground(Color.WHITE);
		lblLinje.setFont(new Font("Calibri", Font.BOLD, 20));
		lblLinje.setBounds(12, 46, 49, 26);
		contentPane.add(lblLinje);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Calibri", Font.BOLD, 20));
		lblDestination.setForeground(Color.WHITE);
		lblDestination.setBounds(128, 46, 106, 26);
		contentPane.add(lblDestination);
		
		JLabel lblAvgar = new JLabel("Avg\u00E5r");
		lblAvgar.setForeground(Color.WHITE);
		lblAvgar.setFont(new Font("Calibri", Font.BOLD, 20));
		lblAvgar.setBounds(354, 49, 56, 21);
		contentPane.add(lblAvgar);
		
		JLabel lblLinjeText = new JLabel("");
		lblLinjeText.setForeground(Color.WHITE);
		lblLinjeText.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblLinjeText.setBounds(12, 70, 104, 170);
		contentPane.add(lblLinjeText);
		
		JLabel lblDestinationText = new JLabel("");
		lblDestinationText.setForeground(Color.WHITE);
		lblDestinationText.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblDestinationText.setBounds(128, 71, 213, 169);
		contentPane.add(lblDestinationText);
		
		JLabel lblAvgarText = new JLabel("");
		lblAvgarText.setForeground(Color.WHITE);
		lblAvgarText.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblAvgarText.setBounds(354, 70, 84, 170);
		contentPane.add(lblAvgarText);
		
		JLabel lblLate = new JLabel("");
		lblLate.setForeground(Color.WHITE);
		lblLate.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblLate.setBounds(450, 70, 70, 170);
		contentPane.add(lblLate);
	}
}
