import java.util.Date;

public class WeekdayState implements IState {

	@Override
	public String formatDayOfWeek(String formattedDate) {
		return formattedDate.toLowerCase();
	}

	@Override
	public String formatDate(Date date) {
		return date.toString();
	}

	@Override
	public String getHasWork() {
		return "yes";
	}

	@Override
	public void soundAlarm() {
		System.out.println("Alarm");
	}

}
