import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Se450Date {
	private Calendar cal;
	
	private IState currentState;
	
	public Se450Date() {
		cal = Calendar.getInstance();
		setState();
	}
	
	public void addDate(){
		cal.add(Calendar.DATE, 1);
		setState();
	}
	
	private void setState() {
		if(isWeekend()) {
			currentState = new WeekendState();
		}
		else {
			currentState = new WeekdayState();
		}
	}
	
	private boolean isWeekend() {
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek == 1 || dayOfWeek == 7;
	}
	
	public void printDayOfWeek() {
		String formattedDate = new SimpleDateFormat("EEEE").format(cal.getTime());
		System.out.println(currentState.formatDayOfWeek(formattedDate));
	}
	
	public void printDate() {
		System.out.println(currentState.formatDate(cal.getTime()));
	}
	
	public void doIHaveWorkToday() {
		System.out.println(currentState.getHasWork());
	}
	
	public void soundAlarm() {
		currentState.soundAlarm();
	}
}
/*
 get Day of week:
 cal.get(Calendar.DAY_OF_WEEK)
 - returns 1-based day of week (1 and 7 are weekends)
 
 print out Day of week
new SimpleDateFormat("EEEE").format(cal.getTime())
 - returns the day of the week as a String 

*/