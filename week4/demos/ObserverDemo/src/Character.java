
public class Character implements ISpaceBarObserver {
	private static int idSeed = 0;
	
	private int id;
	
	public Character() {
		id = idSeed++;
	}
	
	@Override
	public void update() {
		System.out.println("Character " + id + " jumped!");
	}

}
