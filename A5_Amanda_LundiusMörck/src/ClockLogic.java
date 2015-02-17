
public class ClockLogic implements ClockInterface {

	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;
	
	public ClockLogic (DigitalClockGUI clockIn){
		this.clockGUI = clockIn;
		//h�r m�ste man ha detta
		Thread t = new ClockThread(this);
		t.start();
		
	}
	
	public void setAlarm (int hours, int minutes){
		this.alarmHour = hours;
		this.alarmMinute = minutes;
		
	}
	
	public void clearAlarm(){
		
	}

	@Override
	public void update(int hours, int minutes, int seconds) {
		// TODO Auto-generated method stub
		clockGUI.setTimeOnLabel(hours + ":" + minutes + ":" + seconds);
	}
}
