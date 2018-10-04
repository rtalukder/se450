import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		KeyboardCommandHandler handler = new KeyboardCommandHandler();
		SpaceBarHandler spacebarHandler = new SpaceBarHandler();
		handler.registerObserver(spacebarHandler);
		
		for(int i = 0; i < 10; i++) {
			Character c = new Character();
			
			if(i % 2 == 0)
				spacebarHandler.registerObserver(c);
		}
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(!(input = br.readLine()).toLowerCase().equals("exit")) {
        	handler.readInput(input);
        }
	}

}
