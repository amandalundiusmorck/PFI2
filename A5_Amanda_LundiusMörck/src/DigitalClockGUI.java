import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.util.Random; 

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
	JLabel lblAlarmSet = new JLabel("No Alarm");
	JButton btnClearAlarm = new JButton("Clear Alarm");
	JLabel lblErrorMsg = new JLabel("");
	Random rand = new Random();
	
	
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
		lblAlarmClock.setBounds(164, 11, 237, 45);
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
				// Checks if the times set are legal.
			    int hourCheck = Integer.parseInt(textFieldHour.getText());
			    int minuteCheck = Integer.parseInt(textFieldMinutes.getText());

			    if (hourCheck < 0 || hourCheck > 23 || minuteCheck < 0
			      || minuteCheck > 59) {
			     lblErrorMsg.setText("Bending time, are we?");
			    } else {
			     String zero4 = "";
			     String zero5 = "";
			     
			     if (hourCheck < 10){
			      zero4 = "0";
			     }
			     if (minuteCheck < 10){
			      zero5 = "0";
			     }
			     
			     // Changes the alarm label to match the input alarm
			     lblAlarmSet.setText(zero4 + hourCheck + ":" + zero5 + minuteCheck);

				//Changes the color of the background!
				float hue = rand.nextFloat();
				float sat = (rand.nextInt(2000) + 5000) / 10000f;
				float lum = 0.8f;
				Color color = Color.getHSBColor(hue, sat, lum);
				contentPane.setBackground(color); 
				lblAlarmSet.setText("Alarm Set " + textFieldHour.getText() + ":" + textFieldMinutes.getText());
				
				zero4 = "";
			    zero5 = "";
			    
			    lblErrorMsg.setText("");
			}
			}
			});
		btnSetAlarm.setForeground(new Color(148, 0, 211));
		btnSetAlarm.setFont(new Font("Arial Unicode MS", Font.BOLD, 24));
		btnSetAlarm.setBounds(234, 146, 188, 40);
		contentPane.add(btnSetAlarm);
		

		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAlarmSet.setText("No Alarm");
			}
		});
		btnClearAlarm.setForeground(new Color(148, 0, 211));
		btnClearAlarm.setFont(new Font("Arial Unicode MS", Font.BOLD, 24));
		btnClearAlarm.setBounds(234, 197, 188, 40);
		contentPane.add(btnClearAlarm);
		
		lblAlarmSet.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmSet.setForeground(Color.WHITE);
		lblAlarmSet.setFont(new Font("Arial Unicode MS", Font.BOLD, 22));
		lblAlarmSet.setBackground(Color.WHITE);
		lblAlarmSet.setBounds(164, 54, 237, 40);
		contentPane.add(lblAlarmSet);
		
		JLabel imageClock = new JLabel("");
		imageClock.setBackground(Color.WHITE);
		imageClock.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Image/405706_LB_00_FB.EPS_1000.jpg")));
		imageClock.setBounds(26, 0, 108, 141);
		contentPane.add(imageClock);
		lblErrorMsg.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblErrorMsg.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblErrorMsg.setForeground(Color.WHITE);
		lblErrorMsg.setBounds(164, 99, 237, 36);
		contentPane.add(lblErrorMsg);
		
		//ny klocka
		clockLogic = new ClockLogic(this);

	}
	public void setTimeOnLabel (String time){
		lblAlarmClock.setText(time);
	}
	
	public void alarm (boolean activate){
		
	}
}
