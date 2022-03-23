package Figure;

public class Triangle extends Figure {

	private double a;
	private double h;
	private double b;
	private double c;

	public Triangle(double a, double h, double b, double c) {
		this.a = a;
		this.h = h;
		this.b = b;
		this.c = c;
	}

	public void area() {
		double S = 0.5 * a * h;
		System.out.println("Площадь треулогьника: " + S);
	}

//  P=a+b+c
	public void perimeter() {
		double P = a + b + c;
		System.out.println("Периметр треулогьника: " + P);
	}

	public void info() {
		System.out
				.println("Площадь треулогьника вычисляется по формуле: S = 0.5 * a * h, где a - основание, h - высота");
		System.out.println("Периметр треулогьника вычисляется по формуле: P = a + b + c");
	}

}