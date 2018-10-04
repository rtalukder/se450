import java.io.*;

import Calculator.AdditionOperator;
import Calculator.Calculator;
import Calculator.ExponentOperator;
import Calculator.IOperator;
import Calculator.MultiplicationOperator;
import Calculator.SubtractionOperator;
public class Main {
	public static void main(String[] args) throws IOException{
		System.out.println("Enter operations in the form of \"x + y\" (with spaces)");

		Calculator calc = new Calculator();
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(!(input = br.readLine()).toLowerCase().equals("exit")) {
        	String[] inputParts = input.split(" ");
        	int int1 = Integer.parseInt(inputParts[0]);
        	String operator = inputParts[1];
        	int int2 = Integer.parseInt(inputParts[2]);
        	
        	int result = 0;
        	IOperator operatorStrategy = null;
        	
        	if(operator.equals("+"))
        		operatorStrategy = new AdditionOperator(); 
        	else if (operator.equals("-"))
        		operatorStrategy = new SubtractionOperator();
        	else if (operator.equals("*"))
        		operatorStrategy = new MultiplicationOperator();
        	else if (operator.equals("^"))
        		operatorStrategy = new ExponentOperator();
        		
        	result = calc.calculate(int1, int2, operatorStrategy);
        	System.out.println(result);
        }
	}
}
