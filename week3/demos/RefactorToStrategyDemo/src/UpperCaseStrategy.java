
public class UpperCaseStrategy implements IStringFormatter {

	@Override
	public String format(String printString) {
		return printString.toUpperCase();
	}

}
