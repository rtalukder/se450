import java.util.ArrayList;
import java.util.List;

public class SpaceBarHandler implements ISubject, IKeyboardCommandObserver {
	private List<ISpaceBarObserver> observers = new ArrayList<>();
	
	@Override
	public void registerObserver(ISpaceBarObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ISpaceBarObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notify(String input) {
		if(input.equals(" "))
			notifyObservers();
	}

	private void notifyObservers() {
		for(ISpaceBarObserver observer : observers) {
			observer.update();
		}
	}
}
