import java.util.ArrayList;
import java.util.List;

public class KeyboardCommandHandler implements IKeyboardCommandSubject{
	private List<IKeyboardCommandObserver> observers = new ArrayList<>();
	
	@Override
	public void registerObserver(IKeyboardCommandObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IKeyboardCommandObserver observer) {
		observers.remove(observer);
	}
	
	public void readInput(String input) {
		for(IKeyboardCommandObserver observer : observers) {
			observer.notify(input);
		}
	}
	
}
