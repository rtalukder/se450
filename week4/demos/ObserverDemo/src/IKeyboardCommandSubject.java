
public interface IKeyboardCommandSubject {
	void registerObserver(IKeyboardCommandObserver observer);
	void removeObserver(IKeyboardCommandObserver observer);
}
