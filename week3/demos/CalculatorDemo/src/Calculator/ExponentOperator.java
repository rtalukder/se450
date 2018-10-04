package Calculator;

public class ExponentOperator implements IOperator {

	@Override
	public int calculate(int int1, int int2) {
		int result = 1;
		for(int i = 1; i < int2; i++) {
			result *= int1;
		}
		
		return result;
	}

}
