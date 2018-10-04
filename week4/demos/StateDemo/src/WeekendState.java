import java.util.Date;

public class WeekendState implements IState {

	@Override
	public String formatDayOfWeek(String formattedDate) {
		return formattedDate.toUpperCase();
	}

	@Override
	public String formatDate(Date date) {
		return "-> " + date.toString();
	}

	@Override
	public String getHasWork() {
		return "no";
	}

	@Override
	public void soundAlarm() {
		
	}

}
