package com.endava.calculator;

public class BasicCalculatorImpl implements BasicCalculator {

	private Integer floatingPointNumbers;

	public BasicCalculatorImpl() {
		floatingPointNumbers = 2;
	}

	public BasicCalculatorImpl(Integer n) {
		floatingPointNumbers = n;
	}

	protected Integer getFloatingPointNumbers() {
		return floatingPointNumbers;
	}
	@Override
	public Long add( Integer... array ) {
		Long sum = 0L;
		for(Integer number : array) {
			sum += number;
		}
		return sum;
	}

	@Override
	public Long add( Long a, Long b ) {
		return a+b;
	}

	@Override
	public Double add( Double a, Double b ) {
		return a+b;
	}

	@Override
	public Long multiply( Integer a, Integer b ) {
		return Long.valueOf( a*b );
	}

	@Override
	public Double multiply( Double a, Double b ) {
		return a*b;
	}

	@Override
	public Double divide( Double a, Double b ) {
		return a/b;
	}
}
