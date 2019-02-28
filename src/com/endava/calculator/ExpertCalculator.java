package com.endava.calculator;

public interface ExpertCalculator extends BasicCalculator {

	Long pow(Integer x, Integer n);
	Double root(Integer x, Double n);
	Long factorial(Integer n);
	Double evaluate(String expression);

}
