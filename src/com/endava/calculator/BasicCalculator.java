package com.endava.calculator;

public interface BasicCalculator {

	abstract Long add(Integer... array);
	Long add(Long a, Long b);
	Double add(Double a, Double b);

	Long multiply(Integer a, Integer b);
	Double multiply(Double a, Double b);

	Double divide(Double a, Double b);
}
