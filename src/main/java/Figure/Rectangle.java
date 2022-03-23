package Figure;

public class Rectangle extends Figure {
	private double a;
	private double b;

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

//  Прямоугольник S = a*b
	public void area() {
		double s = a * b;
		System.out.println("Площадь прямоугольника: " + s);
	}

//  P = 2 * (a + b)
	public void perimeter() {
		double P = 2 * (a + b);
		System.out.println("Периметр прямоугольника: " + P);
	}

	public void info() {
		System.out.println("Площадь прямоугольника вычисляется по формуле: S = a * b");
		System.out.println("Периметр треулогьника вычисляется по формуле: P = 2 * (a + b)");
	}

}