package team3;

public abstract class Calculation {
	private double side1;

	public double getside1() {
		return side1;
	}

	public void setside1(double side1) {
		this.side1 = side1;
	}

	public abstract double calculate(double a);
}