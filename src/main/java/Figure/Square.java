package Figure;

public class Square extends Figure {
	private double a;

	public Square(double a) {
		this.a = a;
	}

//  Квадрат  S = a*a
	public void area() {
		double s = a * a;
		System.out.println("Площадь квадрат: " + s);
	}

//  P = 4 * a 
	public void perimeter() {
		double P = 4 * a;
		System.out.println("Периметр квадрат: " + P);
	}

//  P=4a
	public void info() {
		System.out.println("Площадь квадрата вычисляется по формуле: S =  a^2");
		System.out.println("Периметр треулогьника вычисляется по формуле: P = 4 * a");
	}
}
