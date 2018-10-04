import java.util.Date;

public interface IState {

	String formatDayOfWeek(String formattedDate);

	String formatDate(Date time);

	String getHasWork();

	void soundAlarm();
	
}
