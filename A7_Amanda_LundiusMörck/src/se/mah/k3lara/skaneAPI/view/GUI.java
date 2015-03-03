package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.Font;
import java.util.Calendar;

public class GUI extends JFrame {

	private JPanel contentPane;
	JLabel labelLinje1 = new JLabel("");
	JLabel labelLinje2 = new JLabel("");
	JLabel labelLinje3 = new JLabel("");
	JLabel labelLinje4 = new JLabel("");
	
	JLabel labelDes1 = new JLabel("");
	JLabel labelDes2 = new JLabel("");
	JLabel labelDes3 = new JLabel("");
	JLabel labelDes4 = new JLabel("");
	
	JLabel labelTime1 = new JLabel("");
	JLabel labelTime2 = new JLabel("");
	JLabel labelTime3 = new JLabel("");
	JLabel labelTime4 = new JLabel("");
	
	JLabel labelLate1 = new JLabel("");
	JLabel labelLate2 = new JLabel("");
	JLabel labelLate3 = new JLabel("");
	JLabel labelLate4 = new JLabel("");

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
		lblLinje.setForeground(Color.ORANGE);
		lblLinje.setFont(new Font("Calibri", Font.BOLD, 20));
		lblLinje.setBounds(12, 46, 49, 26);
		contentPane.add(lblLinje);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Calibri", Font.BOLD, 20));
		lblDestination.setForeground(Color.ORANGE);
		lblDestination.setBounds(128, 46, 106, 26);
		contentPane.add(lblDestination);
		
		JLabel lblAvgar = new JLabel("Avg\u00E5r");
		lblAvgar.setForeground(Color.ORANGE);
		lblAvgar.setFont(new Font("Calibri", Font.BOLD, 20));
		lblAvgar.setBounds(354, 49, 56, 21);
		contentPane.add(lblAvgar);
		
		
		labelLinje1.setForeground(Color.WHITE);
		labelLinje1.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelLinje1.setBounds(12, 70, 104, 31);
		contentPane.add(labelLinje1);
		
		
		labelLinje2.setForeground(Color.WHITE);
		labelLinje2.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelLinje2.setBounds(12, 114, 104, 31);
		contentPane.add(labelLinje2);
		
		
		labelLinje3.setForeground(Color.WHITE);
		labelLinje3.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelLinje3.setBounds(12, 158, 104, 31);
		contentPane.add(labelLinje3);
		
		
		labelLinje4.setForeground(Color.WHITE);
		labelLinje4.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelLinje4.setBounds(12, 209, 104, 31);
		contentPane.add(labelLinje4);
		
		
		labelDes1.setForeground(Color.WHITE);
		labelDes1.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelDes1.setBounds(128, 71, 213, 31);
		contentPane.add(labelDes1);
		
		
		labelDes2.setForeground(Color.WHITE);
		labelDes2.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelDes2.setBounds(128, 114, 213, 31);
		contentPane.add(labelDes2);
		
		
		labelDes3.setForeground(Color.WHITE);
		labelDes3.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelDes3.setBounds(128, 158, 213, 31);
		contentPane.add(labelDes3);
		
		
		labelDes4.setForeground(Color.WHITE);
		labelDes4.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelDes4.setBounds(128, 209, 213, 31);
		contentPane.add(labelDes4);
		
		
		labelTime1.setForeground(Color.WHITE);
		labelTime1.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelTime1.setBounds(354, 70, 84, 31);
		contentPane.add(labelTime1);
		
		
		labelTime2.setForeground(Color.WHITE);
		labelTime2.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelTime2.setBounds(354, 114, 84, 31);
		contentPane.add(labelTime2);
		
		
		labelTime3.setForeground(Color.WHITE);
		labelTime3.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelTime3.setBounds(354, 158, 84, 31);
		contentPane.add(labelTime3);
		
		
		labelTime4.setForeground(Color.WHITE);
		labelTime4.setFont(new Font("Calibri", Font.PLAIN, 20));
		labelTime4.setBounds(354, 209, 84, 31);
		contentPane.add(labelTime4);
		
		  labelLate1.setForeground(Color.WHITE);
		  labelLate1.setFont(new Font("Calibri", Font.PLAIN, 20));
		  labelLate1.setBounds(450, 70, 70, 31);
		  contentPane.add(labelLate1);
		  
		  labelLate2.setForeground(Color.WHITE);
		  labelLate2.setFont(new Font("Calibri", Font.PLAIN, 20));
		  labelLate2.setBounds(450, 114, 70, 31);
		  
		  contentPane.add(labelLate2);
		  labelLate3.setForeground(Color.WHITE);
		  labelLate3.setFont(new Font("Calibri", Font.PLAIN, 20));
		  labelLate3.setBounds(450, 158, 70, 31);
		  
		  contentPane.add(labelLate3);
		  labelLate4.setForeground(Color.WHITE);
		  labelLate4.setFont(new Font("Calibri", Font.PLAIN, 20));
		  labelLate4.setBounds(450, 209, 70, 31);
		  
		  contentPane.add(labelLate4);
		  
		  	UpdateLables();
			Lines lines = Parser.getStationResults(new Station("80046"));

			  labelLinje1.setText(lines.getLines().get(0).getLine());
			  labelLinje2.setText(lines.getLines().get(1).getLine());
			  labelLinje3.setText(lines.getLines().get(2).getLine());
			  labelLinje4.setText(lines.getLines().get(3).getLine());
			  
			  labelDes1.setText(lines.getLines().get(0).getDestination());
			  labelDes2.setText(lines.getLines().get(1).getDestination());
			  labelDes3.setText(lines.getLines().get(2).getDestination());
			  labelDes4.setText(lines.getLines().get(3).getDestination());
			  
			  labelTime1.setText(lines.getLines().get(0).getDepTime().get(Calendar.HOUR_OF_DAY)+":"+ lines.getLines().get(0).getDepTime().get(Calendar.MINUTE));
			  labelTime2.setText(lines.getLines().get(1).getDepTime().get(Calendar.HOUR_OF_DAY)+":"+ lines.getLines().get(1).getDepTime().get(Calendar.MINUTE));
			  labelTime3.setText(lines.getLines().get(2).getDepTime().get(Calendar.HOUR_OF_DAY)+":"+ lines.getLines().get(2).getDepTime().get(Calendar.MINUTE));
			  labelTime4.setText(lines.getLines().get(3).getDepTime().get(Calendar.HOUR_OF_DAY)+":"+ lines.getLines().get(3).getDepTime().get(Calendar.MINUTE));
			  
			  
	}
	
	public void UpdateLables(){
		
	}
	
}
