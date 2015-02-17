
public class ClockLogic implements ClockInterface {

	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;
	
	public ClockLogic (DigitalClockGUI clockIn){
		this.clockGUI = clockIn;
		//här måste man ha detta
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
		String zero1 = "";
		  String zero2 = "";
		  String zero3 = "";
		  
		  if (hours < 10){
		   zero1 = "0";
		  }
		  if (minutes < 10){
		   zero2 = "0";
		  }
		  if (seconds < 10){
		   zero3 = "0";
		  }

		clockGUI.setTimeOnLabel(zero1 + hours + ":" + zero2 + minutes + ":" + zero3 + seconds);
		  zero1 = "";
		  zero2 = "";
		  zero3 = "";
		
	}
}
