package team3;

import team3.Calculation;

public class SquareCalculation extends Calculation {
	
	SquareCalculation(Double a){
		super.setside1(a);
	}
	
	@Override
	public double calculate(double a) {
		  return a*a*Math.PI;
	}
	
}
