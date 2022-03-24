package Figure;

public class Circle extends Figure {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

//  S=πR²
	public void area() {
		double s = PI * (Math.pow(r, 2));
		System.out.println("Площадь круга: " + s);
	}

// P=2πR
	public void perimeter() {
		double P = 2 * PI * r;
		System.out.println("Периметр круга: " + P);
	}

	public void info() {
		System.out.println("Площадь прямоугольника вычисляется по формуле: S = PIr^2)");
		System.out.println("Периметр треулогьника вычисляется по формуле: P = 2PIr");
	}

}
