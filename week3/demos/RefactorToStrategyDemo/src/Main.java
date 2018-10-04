import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text to convert");
        String arg = br.readLine();
        System.out.println("Enter type of conversion");
		String input;
		StringPrinter printer = new StringPrinter(arg);
        while(!(input = br.readLine()).toLowerCase().equals("exit")) {
        	IStringFormatter formatter = null;
        	
        	switch(input.toLowerCase()) {
            case "lowercase":
            	formatter = new LowerCaseStrategy();
                break;
            case "uppercase":
            	formatter = new UpperCaseStrategy();
                break;
	        case "togglecase":
	        	formatter = new ToggleCaseStrategy();
	            break;
	    	}
        	
        	printer.print(formatter);
        }
	}
}
