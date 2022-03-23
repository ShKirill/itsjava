package statics;

public class Salary {
	private final double baseSalary;
	private static double increaseCoeficient = 2.5;
	public final static double CEO = 500_000.0;

	public double getFullSalary() {
		return baseSalary * increaseCoeficient;
	}

	public Salary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public static double getIncreaseCoeficient() {
		return increaseCoeficient;
	}

	public static void setIncreaseCoeficient(double increaseCoeficient) {
		Salary.increaseCoeficient = increaseCoeficient;
	}

}
