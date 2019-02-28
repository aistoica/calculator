package com.endava.calculator;

public class TestCalculator {

	public static void main( String[] args ) {
		BasicCalculator basicCalculator = new BasicCalculatorImpl();
		ExpertCalculator expertCalculator = new ExpertCalculatorImpl();

		System.out.println(expertCalculator.evaluate( "2+3" ));
		System.out.println(expertCalculator.evaluate( "4-2" ));
		System.out.println(expertCalculator.evaluate( "2+3+4" ));
		System.out.println("2+3*4=" + expertCalculator.evaluate( "2+3*4" ));
		System.out.println("2*3-4=" + expertCalculator.evaluate( "2*3-4" ));
		System.out.println("2*(2+8)=" + expertCalculator.evaluate( "(2+3)*5+(2+8)" ));






	}
}
