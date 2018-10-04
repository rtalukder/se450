
public class ToggleCaseStrategy implements IStringFormatter {

	@Override
	public String format(String printString) {
		char[] characters = printString.toCharArray();
		boolean isUpperCase = true;
		StringBuilder sb = new StringBuilder();
		
		for(char c : characters) {
			if(isUpperCase)
				sb.append(Character.toUpperCase(c));
			else
				sb.append(Character.toLowerCase(c));
			
			isUpperCase = !isUpperCase;
		}
		
		return sb.toString();
	}

}
