package statics;

public class StaticPractice {

	public static void main(String[] args) {
//		System.out.println (Salary.increaseCoeficient);

		Salary cleanerSalary = new Salary(5_000.0);
		Salary targetSalary = new Salary(10_000.0);

		System.out.println("cleanerSalary = " + cleanerSalary.getFullSalary());
		System.out.println("targetSalary = " + targetSalary.getFullSalary());

		Salary.setIncreaseCoeficient(1.0);

		System.out.println("cleanerSalary = " + cleanerSalary.getFullSalary());
		System.out.println("targetSalary = " + targetSalary.getFullSalary());

		System.out.println("Salary.CEO = " + Salary.CEO);
	}

}
