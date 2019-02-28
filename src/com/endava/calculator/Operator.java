package com.endava.calculator;

public enum Operator {

	ADD( "\\+" ),
	SUBTRACT( "\\-" ),
	MULTIPLY( "\\*" ),
	DIVIDE( "\\/" ),
	PARENTHESIS( "(", ")" );

	private String sign;
	private String startSign;
	private String endSign;

	private Operator( String sign ) {
		this.sign = sign;
	}

	private Operator( String startSign, String endSign ) {
		this.startSign = startSign;
		this.endSign = endSign;
	}

	public String getSign() {
		return sign;
	}

	public String getStartSign() {
		return startSign;
	}

	public String getEndSign() {
		return endSign;
	}

	public static Operator[] getValues() {
		return new Operator[] { PARENTHESIS, ADD, SUBTRACT, MULTIPLY, DIVIDE };
	}
}
