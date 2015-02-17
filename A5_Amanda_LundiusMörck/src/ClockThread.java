import java.util.Calendar; 

public class ClockThread extends Thread{

	private boolean running = true;
	private ClockInterface clockInterface;

	
	public ClockThread (ClockInterface ci){
		this.clockInterface = ci;
	}
	
	@Override
	//void run() ist�llet f�r void start()
	public void run(){
			while (running) {
				
				Calendar now = Calendar.getInstance();
				clockInterface.update(now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));
				//s�tter sleep efter s� klockan kommer fram direkt
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}
	}
	
}
