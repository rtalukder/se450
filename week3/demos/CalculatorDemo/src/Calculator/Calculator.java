package Calculator;

public class Calculator {
	public int calculate(int int1, int int2, IOperator operator) {
		return operator.calculate(int1, int2);
	}
}
