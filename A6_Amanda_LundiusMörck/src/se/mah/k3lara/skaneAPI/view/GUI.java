package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JScrollPane;

public class GUI extends JFrame {

	private JPanel contentPane;
	JTextField textFieldSearch;
	JTextField textFieldFrom;
	JTextField textFieldTo;
	JTextArea textAreaStations = new JTextArea();
	JTextArea textAreaJourney = new JTextArea();
	
	private Parser p = new Parser();
	
	Thread tJ = new JourneysThread (p, this);
	Thread tS = new StationsThread (p, this);
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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(12, 13, 201, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(0, 24, 201, 22);
		panel.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JButton btnSearchStation = new JButton("Search");
		btnSearchStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tS.start();
			}
		});
		btnSearchStation.setBounds(50, 52, 97, 25);
		panel.add(btnSearchStation);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 90, 201, 137);
		panel.add(scrollPane);
		scrollPane.setViewportView(textAreaStations);
		
		JLabel lblSearchStations = new JLabel("Search Stations");
		lblSearchStations.setForeground(Color.WHITE);
		lblSearchStations.setBounds(0, 0, 110, 16);
		panel.add(lblSearchStations);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(225, 13, 195, 227);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textFieldFrom = new JTextField();
		textFieldFrom.setBounds(0, 25, 91, 22);
		panel_1.add(textFieldFrom);
		textFieldFrom.setColumns(10);
		
		textFieldTo = new JTextField();
		textFieldTo.setColumns(10);
		textFieldTo.setBounds(103, 25, 92, 22);
		panel_1.add(textFieldTo);
		
		JButton btnSearchJourney = new JButton("Search");
		btnSearchJourney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tJ.start();
			}
		});
		btnSearchJourney.setBounds(52, 52, 97, 25);
		panel_1.add(btnSearchJourney);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 90, 195, 137);
		panel_1.add(scrollPane_1);
		
		scrollPane_1.setViewportView(textAreaJourney);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setBounds(0, 0, 110, 16);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setForeground(Color.WHITE);
		lblTo.setBounds(103, 0, 110, 16);
		panel_1.add(lblTo);
	}
}
