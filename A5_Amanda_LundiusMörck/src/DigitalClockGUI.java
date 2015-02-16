import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHour;
	private JTextField textFieldMinutes;
	private ClockLogic clockLogic; 
	
	JLabel lblAlarmClock = new JLabel("00:00:00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/Image/AlarmClockImage.png")));
		setFont(new Font("Arial Unicode MS", Font.BOLD, 25));
		setForeground(new Color(128, 0, 128));
		setTitle("Alarm Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAlarmClock.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmClock.setFont(new Font("Arial Unicode MS", Font.BOLD, 28));
		lblAlarmClock.setForeground(Color.WHITE);
		lblAlarmClock.setBackground(Color.WHITE);
		lblAlarmClock.setBounds(164, 22, 237, 61);
		contentPane.add(lblAlarmClock);
		
		textFieldHour = new JTextField();
		textFieldHour.setBounds(154, 146, 70, 40);
		contentPane.add(textFieldHour);
		textFieldHour.setColumns(10);
		
		textFieldMinutes = new JTextField();
		textFieldMinutes.setColumns(10);
		textFieldMinutes.setBounds(154, 197, 70, 40);
		contentPane.add(textFieldMinutes);
		
		JLabel lblHour = new JLabel("Hour:");
		lblHour.setFont(new Font("Arial Unicode MS", Font.BOLD, 24));
		lblHour.setForeground(Color.WHITE);
		lblHour.setBounds(71, 146, 63, 40);
		contentPane.add(lblHour);
		
		JLabel lblMinutes = new JLabel("Minutes:");
		lblMinutes.setForeground(Color.WHITE);
		lblMinutes.setFont(new Font("Arial Unicode MS", Font.BOLD, 24));
		lblMinutes.setBounds(37, 189, 98, 45);
		contentPane.add(lblMinutes);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSetAlarm.setForeground(new Color(148, 0, 211));
		btnSetAlarm.setFont(new Font("Arial Unicode MS", Font.BOLD, 24));
		btnSetAlarm.setBounds(234, 146, 188, 40);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClearAlarm.setForeground(new Color(148, 0, 211));
		btnClearAlarm.setFont(new Font("Arial Unicode MS", Font.BOLD, 24));
		btnClearAlarm.setBounds(234, 197, 188, 40);
		contentPane.add(btnClearAlarm);
		
		JLabel lblAlarmSet = new JLabel("Alarm Set 00:00");
		lblAlarmSet.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmSet.setForeground(Color.WHITE);
		lblAlarmSet.setFont(new Font("Arial Unicode MS", Font.BOLD, 22));
		lblAlarmSet.setBackground(Color.WHITE);
		lblAlarmSet.setBounds(164, 83, 237, 40);
		contentPane.add(lblAlarmSet);
		
		JLabel imageClock = new JLabel("");
		imageClock.setBackground(Color.WHITE);
		imageClock.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Image/405706_LB_00_FB.EPS_1000.jpg")));
		imageClock.setBounds(26, 0, 108, 141);
		contentPane.add(imageClock);
	}
	public void setTimeOnLabel (String time){
		lblAlarmClock.setText(time);
	}
	
	public void alarm (boolean activate){
		
	}
}
