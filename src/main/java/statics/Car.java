package statics;

public class Car {
	private static String color;
	private static String company;
	public final static double PRICE = 500_000.0;

	public Car(String company, String color) {
		this.company = company;
		this.color = color;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Car.color = color;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Car.company = company;
	}

	public static double getPrice() {
		return PRICE;
	}

}
