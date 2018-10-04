
public class LowerCaseStrategy implements IStringFormatter {

	@Override
	public String format(String printString) {
		return printString.toLowerCase();
	}

}
