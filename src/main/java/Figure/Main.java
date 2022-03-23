package Figure;

public class Main {

	public static void main(String[] args) {

		Figure triangle = new Triangle(5, 4, 4, 3);
		Figure rectangle = new Rectangle(6, 3);
		Figure square = new Square(8);

		triangle.info();
		triangle.area();
		triangle.perimeter();
		System.out.println();

		rectangle.info();
		rectangle.area();
		rectangle.perimeter();

		System.out.println();
		square.info();
		square.area();
		square.perimeter();

	}

}